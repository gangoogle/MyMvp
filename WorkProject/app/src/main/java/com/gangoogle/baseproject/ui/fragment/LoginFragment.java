package com.gangoogle.baseproject.ui.fragment;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gangoogle.baseproject.R;
import com.gangoogle.baseproject.presenter.LoginPresenter;
import com.gangoogle.baseproject.view.LoginView;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by zgyi on 2018/9/25.
 */
public class LoginFragment extends BaseFragment<LoginPresenter> implements LoginView {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.bt_show)
    Button mBtShow;

    Unbinder unbinder;

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_main;
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void onLoginSucc() {

    }

    @Override
    public void initView() {
        super.initView();
        mBtShow.setText("show");
    }

    @OnClick(R.id.bt_show)
    public void onViewClicked() {
        Logger.i( "fragment btn");
        Toast.makeText(mContext, "show toast", Toast.LENGTH_SHORT).show();
    }
}
