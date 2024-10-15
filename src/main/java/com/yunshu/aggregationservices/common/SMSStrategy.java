package com.yunshu.aggregationservices.common;

public interface SMSStrategy {
    /**
     * 发送短信
     * @param phone
     * @param content
     */
    void send(Object properties,String phone, String content);
}
