package com.yunshu.aggregationservices.aliyun;

import com.yunshu.aggregationservices.SMSClient;
import com.yunshu.aggregationservices.aliyun.ProPerties.AliYunProperties;
import com.yunshu.aggregationservices.aliyun.strategy.ALiYunDefaultStrategy;
import com.yunshu.aggregationservices.common.SMSStrategy;

public class AliYunClient implements SMSClient {
    private AliYunProperties properties;

    @Override
    public void send(String phone, String content) {
        SMSStrategy smsStrategy = new ALiYunDefaultStrategy();
        smsStrategy.send(properties, phone, content);
    }
    public AliYunProperties getProperties() {
        return properties;
    }
    public void setProperties(AliYunProperties properties) {
        this.properties = properties;
    }
}
