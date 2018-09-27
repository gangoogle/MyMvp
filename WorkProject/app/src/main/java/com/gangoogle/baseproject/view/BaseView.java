package com.gangoogle.baseproject.view;

import com.gangoogle.baseproject.bean.BaseResultBean;

/**
 * Created by zgyi on 2018/9/25.
 */
public interface BaseView {
    /**
     * 展示loading弹窗
     */
    void showLoading();

    /**
     * 隐藏loading弹窗
     */
    void hideLoading();

    /**
     * 展示错误信息
     *
     * @param msg
     */
    void showError(String msg);

    /**
     * 展示错误码
     */
    void onErrorCode(BaseResultBean model);
}
