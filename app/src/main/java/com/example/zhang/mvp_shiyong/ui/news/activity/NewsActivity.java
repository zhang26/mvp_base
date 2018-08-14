package com.example.zhang.mvp_shiyong.ui.news.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.zhang.mvp_shiyong.R;
import com.example.zhang.mvp_shiyong.base.BaseActivity;
import com.example.zhang.mvp_shiyong.model.entity.NewsBean;
import com.example.zhang.mvp_shiyong.ui.news.adapter.NewsAdapter;
import com.example.zhang.mvp_shiyong.ui.news.contract.NewsContract;
import com.example.zhang.mvp_shiyong.ui.news.presenter.NewsPresenter;

public class NewsActivity extends BaseActivity<NewsPresenter> implements NewsContract.View{

    private RecyclerView recyclerView;

    @Override
    protected int getViewId() {
        return R.layout.activity_news;
    }

    @Override
    protected void initView() {
        presenter.getNewList();

        recyclerView = findViewById(R.id.news_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {

    }

    @Override
    public void show(NewsBean bean) {
        NewsAdapter newsAdapter = new NewsAdapter(R.layout.item_news, bean.getResult().getData());
        recyclerView.setAdapter(newsAdapter);
        Log.e("TAG",bean.getResult().getData().size()+"");
    }

    @Override
    public void showMsg(String msg) {
        Log.e("TAG",msg);
    }
}
