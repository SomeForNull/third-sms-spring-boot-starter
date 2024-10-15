package com.yunshu.aggregationservices.tenxunyun.config;

import com.yunshu.aggregationservices.SMSClient;
import com.yunshu.aggregationservices.common.SMSThirdConfiguration;
import com.yunshu.aggregationservices.tenxunyun.ProPerties.TenXunYunProperties;
import com.yunshu.aggregationservices.tenxunyun.TenXunYunClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TenXunYunProperties.class)
@ConditionalOnProperty(prefix = "aggregation", name = "send-type", havingValue = "tenxunyun")
public class TenXunYunConfiguration implements SMSThirdConfiguration {
    @Bean
    @ConditionalOnMissingBean(SMSClient.class)
    SMSClient smsClient(TenXunYunProperties properties) {
        TenXunYunClient smsClient = new TenXunYunClient();
        smsClient.setProperties(properties);
        return smsClient;
    }
}
