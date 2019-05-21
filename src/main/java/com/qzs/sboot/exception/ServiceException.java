package com.qzs.sboot.exception;

/**
 * 服务调用异常
 */
public class ServiceException extends Exception{
    public ServiceException(String msg) {
        super(msg);
    }
}
