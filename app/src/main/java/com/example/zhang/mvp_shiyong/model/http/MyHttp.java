package com.example.zhang.mvp_shiyong.model.http;
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

import android.widget.ImageView;

import com.example.zhang.mvp_shiyong.model.callback.NetworkCallBack;

import java.io.File;
import java.util.Map;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.model.http
 * @time 2018/8/13 16:31
 */

//网络请求的顶层接口类  做了一些约束
public interface MyHttp {

    /**
     * 无参的get请求
     * @param url 接口地址
     */
    <T> void doGet(String url, NetworkCallBack<T> callback);
    //有参的get请求
    <T> void doGet(String url, Map<String,String> params, NetworkCallBack<T> callback);
    //有参的post请求
    <T> void doPost(String url, Map<String,String> params, NetworkCallBack<T> callback);
    //文件上传
    void upload(String url, Map<String,File> files, Map<String,String> params, NetworkCallBack<String> callback);
    //文件下载
    void download();

    void loadImage(String url, ImageView view);

}
