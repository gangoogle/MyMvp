package com.gangoogle.baseproject.presenter;

import com.gangoogle.baseproject.model.BaseModel;
import com.gangoogle.baseproject.view.LoginView;

/**
 * Created by zgyi on 2018/9/25.
 */
public class LoginPresenter extends BasePresenter<LoginView,BaseModel> {

    public LoginPresenter(LoginView baseView) {
        super(baseView);
    }

    public void doLogin() {
        mBaseView.onLoginSucc();
    }
}
