package com.gangoogle.baseproject.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gangoogle.baseproject.bean.BaseResultBean;
import com.gangoogle.baseproject.presenter.BasePresenter;
import com.gangoogle.baseproject.ui.widget.MyProgressDialog;
import com.gangoogle.baseproject.view.BaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by zgyi on 2018/9/25.
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {
    protected Context mContext;
    protected View mRootView;
    protected P mPresenter;
    private Toast mToast;
    private MyProgressDialog mProgressDialog;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(getContentViewId(), container, false);
        mUnbinder = ButterKnife.bind(this, mRootView);
        mContext = getActivity();
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter = createPresenter();
        initView();
        initData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        if (mUnbinder != null) {
            mUnbinder.unbind();
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
        checkActivityAttached();
        showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        checkActivityAttached();
        hideLoadingDialog();
    }

    @Override
    public void showError(String msg) {
        showToast(msg);
    }

    @Override
    public void onErrorCode(BaseResultBean model) {

    }

    /**
     * 检查activity连接情况
     */
    public void checkActivityAttached() {
        if (getActivity() == null) {
            throw new ActivityNotAttachedException();
        }
    }

    public static class ActivityNotAttachedException extends RuntimeException {
        public ActivityNotAttachedException() {
            super("Fragment has disconnected from Activity !");
        }
    }

    protected abstract int getContentViewId();

    protected abstract P createPresenter();

    public void initView() {
    }

    public void initData() {
    }

}
