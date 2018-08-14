package com.example.zhang.mvp_shiyong.ui.news.presenter;
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

import com.example.zhang.mvp_shiyong.model.biz.MyNewsModel;
import com.example.zhang.mvp_shiyong.model.biz.NewsModel;
import com.example.zhang.mvp_shiyong.model.callback.NetworkCallBack;
import com.example.zhang.mvp_shiyong.model.entity.NewsBean;
import com.example.zhang.mvp_shiyong.ui.news.contract.NewsContract;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.ui.news.presenter
 * @time 2018/8/13 16:55
 */

/**
 *  NewsPresenter   Presenter实现类
 */
public class NewsPresenter implements NewsContract.Presenter{

    private NewsModel model;
    private NewsContract.View view;

    public NewsPresenter(){
        model = new MyNewsModel();
    }

    @Override
    public void getNewList() {
        model.newsList(new NetworkCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean newsBean) {
                if(view != null){
                    view.show(newsBean);
                }
            }

            @Override
            public void onError(String errorMessage) {
                view.showMsg(errorMessage);
            }
        });
    }

    @Override
    public void attach(NewsContract.View view) {
        this.view = view;
    }

    @Override
    public void disconnect() {
        this.view = null;
    }
}
