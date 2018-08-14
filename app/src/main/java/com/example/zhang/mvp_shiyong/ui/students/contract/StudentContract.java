package com.example.zhang.mvp_shiyong.ui.students.contract;
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

import com.example.zhang.mvp_shiyong.base.BasePresenter;
import com.example.zhang.mvp_shiyong.base.BaseView;
import com.example.zhang.mvp_shiyong.model.entity.NewsBean;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.ui.students.contract
 * @time 2018/8/13 20:07
 */

public class StudentContract {

    public interface View extends BaseView {
        //只要页面发生了变化 每一个变化都得对应一个变化的方法
        void show(NewsBean bean);

        void showMsg(String msg);
    }

    public interface Presenter extends BasePresenter<View> {
        void getStudentList(String type,String key);
    }
}
