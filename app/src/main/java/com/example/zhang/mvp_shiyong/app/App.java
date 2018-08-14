package com.example.zhang.mvp_shiyong.app;
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

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.liyi.sutils.utils.SUtils;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.app
 * @time 2018/8/13 14:03
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化工具类
        SUtils.initialize(this);
    }
}
