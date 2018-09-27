package com.gangoogle.baseproject.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.gangoogle.baseproject.bean.BaseResultBean;
import com.gangoogle.baseproject.presenter.BasePresenter;
import com.gangoogle.baseproject.ui.widget.MyProgressDialog;
import com.gangoogle.baseproject.view.BaseView;

import butterknife.ButterKnife;

/**
 * Created by zgyi on 2018/9/25.
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    public Context mContext;
    private MyProgressDialog mProgressDialog;
    protected P mPresenter;
    private Toast mToast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mPresenter = createPresenter();
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public void showToast(String msg) {
        mToast = Toast.makeText(mContext, msg, Toast.LENGTH_LONG);
        mToast.show();
    }

    public void showLoadingDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new MyProgressDialog(mContext);
        }
        mProgressDialog.setCancelable(false);
        mProgressDialog.initDialog("");
    }

    private void hideLoadingDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dissmisDialog();
        }
    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        hideLoadingDialog();
    }

    @Override
    public void showError(String msg) {
        showToast(msg);
    }

    @Override
    public void onErrorCode(BaseResultBean model) {

    }


    public void initData() {
    }

    public void initView() {
    }

    protected abstract P createPresenter();

    protected abstract int getLayoutId();
}
