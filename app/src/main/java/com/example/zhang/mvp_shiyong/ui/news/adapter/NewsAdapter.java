package com.example.zhang.mvp_shiyong.ui.news.adapter;
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

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.zhang.mvp_shiyong.R;
import com.example.zhang.mvp_shiyong.model.entity.NewsBean;

import java.util.List;

/**
 * @author Zhang QQ:2914438742
 * @name mvp_shiyong
 * @class name：com.example.zhang.mvp_shiyong.ui.news.adapter
 * @time 2018/8/13 17:21
 */

public class NewsAdapter extends BaseQuickAdapter<NewsBean.ResultBean.DataBean,BaseViewHolder> {

    public NewsAdapter(int layoutResId, @Nullable List<NewsBean.ResultBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsBean.ResultBean.DataBean item) {
        helper.setText(R.id.item_news_title,item.getTitle());
        Glide.with(mContext).load(item.getThumbnail_pic_s()).into((ImageView) helper.getView(R.id.item_news_ima));
    }
}
