package com.yunshu.aggregationservices;

import com.yunshu.aggregationservices.common.SMSStrategy;

/**
 * 默认短信客户端
 */
public class DefaultClient implements SMSClient{
    @Override
    public void send(String phone, String content) {
        SMSStrategy smsStrategy = new DefaultStrategy();
        smsStrategy.send(null, phone, content);
    }
}
