package com.example.zhang.mvp_shiyong.ui.students.presenter;
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

import com.example.zhang.mvp_shiyong.model.entity.NewsBean;
import com.example.zhang.mvp_shiyong.model.http.RetrofitUtils;
import com.example.zhang.mvp_shiyong.model.service.StudentService;
import com.example.zhang.mvp_shiyong.ui.students.contract.StudentContract;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.ui.students.presenter
 * @time 2018/8/13 20:09
 */

public class StudentPresenter implements StudentContract.Presenter {

    private StudentService studentService;
    private StudentContract.View view;

    public StudentPresenter(){
        studentService = RetrofitUtils.getMineService();
    }


    @Override
    public void getStudentList(String type, String key) {
        studentService.send_news(type,key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NewsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showMsg(e.getMessage());
                    }

                    @Override
                    public void onNext(NewsBean bean) {
                        view.show(bean);
                    }
                });
    }

    @Override
    public void attach(StudentContract.View view) {
        this.view = view;
    }

    @Override
    public void disconnect() {
        this.view = null;
    }
}
