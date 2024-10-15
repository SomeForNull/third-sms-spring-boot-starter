package com.yunshu.aggregationservices.config;

import com.yunshu.aggregationservices.DefaultClient;
import com.yunshu.aggregationservices.ProPerties.AggregationProperties;
import com.yunshu.aggregationservices.SMSClient;
import com.yunshu.aggregationservices.common.SMSConfigurationImportSelector;
import com.yunshu.aggregationservices.common.SMSThirdConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@AutoConfiguration
@EnableConfigurationProperties(AggregationProperties.class)
public class AggregationConfiguration {
    @Configuration(proxyBeanMethods = false)
    @ConditionalOnMissingBean(SMSThirdConfiguration.class)
    @Import(SMSConfigurationImportSelector.class)
    static class SendTypeConfiguration {

    }
    @Bean
    @ConditionalOnMissingBean(SMSClient.class)
    SMSClient smsClient(AggregationProperties properties) {
        return new DefaultClient();
    }
}
