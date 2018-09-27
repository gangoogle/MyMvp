package com.gangoogle.baseproject.bean;

import java.io.Serializable;

/**
 * Created by zgyi on 2018/9/25.
 */
public class BaseResultBean implements Serializable {
    private int errorCode;
    private String errorMsg;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
