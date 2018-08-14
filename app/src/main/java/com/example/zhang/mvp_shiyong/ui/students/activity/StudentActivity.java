package com.example.zhang.mvp_shiyong.ui.students.activity;

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
import com.example.zhang.mvp_shiyong.ui.students.contract.StudentContract;
import com.example.zhang.mvp_shiyong.ui.students.presenter.StudentPresenter;

public class StudentActivity extends BaseActivity<StudentPresenter> implements StudentContract.View {

    private RecyclerView recyclerView;
    public StudentContract.Presenter presenter;

    @Override
    protected int getViewId() {
        return R.layout.activity_student;
    }

    @Override
    protected void initView() {
        recyclerView = findViewById(R.id.students_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presenter.getStudentList("shehui", "1774fd7009ac4d6d2b0d14a349b0daae");

        recyclerView = findViewById(R.id.students_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initData() {

    }

    @Override
    public void show(NewsBean bean) {
        NewsAdapter newsAdapter = new NewsAdapter(R.layout.item_news, bean.getResult().getData());
        recyclerView.setAdapter(newsAdapter);
        Log.e("TAG", bean.getResult().getData().size() + "");
    }

    @Override
    public void showMsg(String msg) {
        Log.e("TAG", msg);
    }
}
