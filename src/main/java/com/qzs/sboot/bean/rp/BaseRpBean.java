package com.qzs.sboot.bean.rp;

import com.qzs.sboot.exception.ServiceException;
import com.qzs.sboot.utils.StringUtils;

import java.io.Serializable;

public class BaseRpBean implements Serializable{
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setServiceException(ServiceException e) {
        this.code = -1;
        if (e != null && !StringUtils.isEmpty(e.getMessage())) {
            this.msg = e.getMessage();
        }

    }


    @Override
    public String toString() {
        return "BaseRpBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
