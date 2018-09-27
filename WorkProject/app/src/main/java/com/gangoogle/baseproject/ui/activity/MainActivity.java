package com.gangoogle.baseproject.ui.activity;

import android.widget.Button;
import android.widget.Toast;

import com.gangoogle.baseproject.R;
import com.gangoogle.baseproject.bean.MovieResponse;
import com.gangoogle.baseproject.presenter.MoviePersenter;
import com.gangoogle.baseproject.view.MovieView;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by zgyi on 2018/9/25.
 */
public class MainActivity extends BaseActivity<MoviePersenter> implements MovieView {
    @BindView(R.id.bt_request)
    Button mBtRequest;
    @BindView(R.id.bt_add_user)
    Button mBtAddUser;

    @Override
    protected MoviePersenter createPresenter() {
        return new MoviePersenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        super.initData();

    }

    @Override
    public void onGetMovieSuccess(MovieResponse movieResponse) {
    }

    @Override
    public void onInsertUser() {
        Toast.makeText(mContext, "插入用户", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.bt_request)
    public void onViewClicked() {
        mPresenter.getMovie("");
    }

    @OnClick(R.id.bt_add_user)
    public void onAddUserClicked() {
        mPresenter.addUser("老王");
    }

    @OnClick(R.id.bt_query_user)
    public void onQueryUserClicked(){
        Logger.d("query");
        mPresenter.queryUser();
    }
}
