package com.example.zhang.mvp_shiyong.ui.f;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.zhang.mvp_shiyong.R;
import com.example.zhang.mvp_shiyong.base.BaseActivity;
import com.example.zhang.mvp_shiyong.base.BaseView;
import com.example.zhang.mvp_shiyong.model.entity.NewsBean;
import com.example.zhang.mvp_shiyong.ui.news.contract.NewsContract;
import com.example.zhang.mvp_shiyong.ui.news.presenter.NewsPresenter;

public class FActivity extends BaseActivity<NewsPresenter> implements NewsContract.View{

    private Button f_a_btn;
    private Button f_b_btn;
    private Button f_c_btn;
    private FrameLayout f_frame;

    @Override
    protected int getViewId() {
        return R.layout.activity_f;
    }

    @Override
    protected void initView() {
        f_a_btn = findViewById(R.id.f_a_btn);
        f_b_btn = findViewById(R.id.f_b_btn);
        f_c_btn = findViewById(R.id.f_c_btn);
        f_frame = findViewById(R.id.f_frame);

        f_a_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changFragment(R.id.f_frame,AFragment.class,null,false,false);
            }
        });
        f_b_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changFragment(R.id.f_frame,BFragment.class,null,true,false);
            }
        });
        f_c_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changFragment(R.id.f_frame,CFragment.class,null,true,false);
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    public void show(NewsBean bean) {

    }

    @Override
    public void showMsg(String msg) {

    }
}
