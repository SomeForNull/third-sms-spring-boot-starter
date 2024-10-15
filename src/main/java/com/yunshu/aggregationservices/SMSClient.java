package com.yunshu.aggregationservices;

public interface SMSClient {

    /**
     * 发送短信
     * @param phone
     * @param content
     */
    void send(String phone, String content);
}
