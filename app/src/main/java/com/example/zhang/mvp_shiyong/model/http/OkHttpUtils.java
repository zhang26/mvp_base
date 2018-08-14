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

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhang.mvp_shiyong.app.App;
import com.example.zhang.mvp_shiyong.model.callback.NetworkCallBack;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.model.http
 * @time 2018/8/13 16:33
 */

public class OkHttpUtils implements MyHttp {

    private static OkHttpUtils okHttpUtils;
    private OkHttpClient okHttpClient;

    //私有化构造,得到okhttp对象
    private OkHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    //共有静态方法，得到对象
    public static OkHttpUtils getInstance() {
        if (okHttpUtils == null) {
            synchronized (OkHttpUtils.class) {
                if (okHttpUtils == null) {
                    okHttpUtils = new OkHttpUtils();
                }
            }
        }
        return okHttpUtils;
    }

    @Override
    public <T> void doGet(String url, final NetworkCallBack<T> callback) {
        //这里我们写一个get无参请求
        final Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                final T t = parseData(string, callback);
                //切换主线程
                Handler mainHandler = new Handler(Looper.getMainLooper());
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        //已在主线程中，可以更新UI
                        callback.onSuccess(t);
                    }
                });
            }
        });
    }

    @Override
    public <T> void doGet(String url, Map<String, String> params, NetworkCallBack<T> callback) {

    }

    @Override
    public <T> void doPost(String url, Map<String, String> params, NetworkCallBack<T> callback) {

    }

    @Override
    public void upload(String url, Map<String, File> files, Map<String, String> params, NetworkCallBack<String> callback) {

    }

    @Override
    public void download() {

    }

    @Override
    public void loadImage(String url, ImageView view) {

    }

    /**
     * parseData 利用反射得到类的实现接口，然后得到接口的参数，最后得到实体类
     */

    private <T> T parseData(String jsonData, NetworkCallBack<T> callback) {
        Type[] interfacesTypes = callback.getClass().getGenericInterfaces();
        Type[] genericType2 = ((ParameterizedType) interfacesTypes[0]).getActualTypeArguments();
        Class<T> classes = (Class<T>) genericType2[0];
        Gson gson = new Gson();
        T t = gson.fromJson(jsonData, classes);
        return t;

    }
}
