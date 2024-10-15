package com.yunshu.aggregationservices.aliyun.config;

import com.yunshu.aggregationservices.SMSClient;
import com.yunshu.aggregationservices.aliyun.AliYunClient;
import com.yunshu.aggregationservices.aliyun.ProPerties.AliYunProperties;
import com.yunshu.aggregationservices.common.SMSThirdConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AliYunProperties.class)
@ConditionalOnProperty(prefix = "aggregation", name = "send-type", havingValue = "aliyun")
public class ALiYunConfiguration implements SMSThirdConfiguration {
    @Bean
    @ConditionalOnMissingBean(SMSClient.class)
    SMSClient smsClient(AliYunProperties properties) {
        AliYunClient smsClient = new AliYunClient();
        smsClient.setProperties(properties);
        return smsClient;
    }
}