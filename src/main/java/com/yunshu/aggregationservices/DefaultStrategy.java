package com.yunshu.aggregationservices;

import com.yunshu.aggregationservices.common.SMSStrategy;
import com.yunshu.aggregationservices.common.SendType;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 默认策略
 */
public class DefaultStrategy implements SMSStrategy {
    @Override
    public void send(Object properties, String phone, String content) {
        Logger logger = Logger.getLogger(DefaultStrategy.class.getName());
        logger.log(Level.WARNING,"无法发送，请配置第三方服务商，当前支持"+ Arrays.toString(SendType.values()));
    }
}
