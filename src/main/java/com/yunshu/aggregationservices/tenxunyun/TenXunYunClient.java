package com.yunshu.aggregationservices.tenxunyun;

import com.yunshu.aggregationservices.SMSClient;
import com.yunshu.aggregationservices.common.SMSStrategy;
import com.yunshu.aggregationservices.tenxunyun.ProPerties.TenXunYunProperties;
import com.yunshu.aggregationservices.tenxunyun.strategy.TenXunYunDefaultStrategy;

public class TenXunYunClient implements SMSClient {
    private TenXunYunProperties properties;

    @Override
    public void send(String phone, String content) {
        SMSStrategy smsStrategy = new TenXunYunDefaultStrategy();
        smsStrategy.send(properties, phone, content);
    }

    public TenXunYunProperties getProperties() {
        return properties;
    }

    public void setProperties(TenXunYunProperties properties) {
        this.properties = properties;
    }
}
