package com.example.zhang.mvp_shiyong.base;
////////////////////////////////////////////////////////////////////                                                                   
//                          _ooOoo_                               //                                                                  
//                         o8888888o                              //                                                                  
//                         88" . "88                              //                                                                  
//                         (| ^_^ |)                              //                                                                  
//                         O\  =  /O                              //                                                                  
//                      ____/`---'\____                           //                                                                  
//                    .'  \\|     |//  `.                         //                                                                  
//                   /  \\|||  :  |||//  \                        //                                                                  
//                  /  _||||| -:- |||||-  \                       //                                                                  
//                  |   | \\\  -  /// |   |                       //                                                                  
//                  | \_|  ''\---/''  |   |                       //                                                                  
//                  \  .-\__  `-`  ___/-. /                       //                                                                  
//                ___`. .'  /--.--\  `. . ___                     //                                                                  
//              ."" '<  `.___\_<|>_/___.'  >'"".                  //                                                                  
//            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //                                                                  
//            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //                                                                  
//      ========`-.____`-.___\_____/___.-`____.-'========         //                                                                  
//                           `=---='                              //                                                                  
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //                                                                  
//                  佛祖保佑       永不宕机     永无BUG           //                                                                  
////////////////////////////////////////////////////////////////////    

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.zhang.mvp_shiyong.app.App;
import com.example.zhang.mvp_shiyong.ui.news.contract.NewsContract;
import com.example.zhang.mvp_shiyong.ui.news.presenter.NewsPresenter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.base
 * @time 2018/8/13 16:18
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    protected T presenter;
    private BaseFragment lastFragment;

    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewId());
        try {
            init();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        initView();
        initData();
    }

    private void init() throws IllegalAccessException, InstantiationException {
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        //获得第一个实现类中所有泛型参数的集合
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        //获得实现接口中第一个泛型的参数
        Class<T> tClass = (Class<T>) actualTypeArguments[0];

        presenter = tClass.newInstance();

        presenter.attach(this);
    }

    protected abstract int getViewId();

    protected abstract void initView();

    protected abstract void initData();

    /**
     * 用于Fragment加载
     *
     * @param containerId   Fragment存放的容器
     * @param fragmentClass 要加载的Fragment
     * @param bundle        要传递的参数
     * @param isReplace     是否替换
     * @param isBack        是否添加到回退栈
     */
    public void changFragment(int containerId, Class<? extends BaseFragment> fragmentClass, Bundle bundle, boolean isReplace, boolean isBack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //获取Fragment类的名字，作为别名
        String simpleName = fragmentClass.getSimpleName();
        //根据别名去栈中查找Fragment 如果存在肯定不为null
        BaseFragment fragment = (BaseFragment) fragmentManager.findFragmentByTag(simpleName);
        if (fragment == null) {
            try {
                fragment = fragmentClass.newInstance();
                transaction.add(containerId, fragment, simpleName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //如果bundle不为空就传递参数
        if (bundle != null) {
            fragment.setBundle(bundle);
        }

        //隐藏上一个fragment
        if (lastFragment != null) {
            transaction.hide(lastFragment);
        }

        //true替换    false显示
        if (isReplace) {
            transaction.replace(containerId, fragment, simpleName);
        } else {
            //显示当前fragment
            transaction.show(fragment);
        }

        //是否添加到回退栈
        if (isBack)
            transaction.addToBackStack(simpleName);

        //把当前fragment赋给lastFragment
        lastFragment = fragment;
        //提交
        transaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.disconnect();
    }

    //系统返回键监听
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        FragmentManager manager = getSupportFragmentManager();
        //得到fragment回退栈个数
        int backStackEntryCount = manager.getBackStackEntryCount();
        if(backStackEntryCount>0){
            //弹出
            manager.popBackStackImmediate();
        }
        int count = manager.getBackStackEntryCount();
        FragmentManager.BackStackEntry backStackEntryAt = manager.getBackStackEntryAt(count - 1);
        String name = backStackEntryAt.getName();
        BaseFragment fragmentByTag = (BaseFragment) manager.findFragmentByTag(name);
        lastFragment = fragmentByTag;
    }
}
