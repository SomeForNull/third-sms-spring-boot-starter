package com.yunshu.aggregationservices.aliyun;

import com.aliyun.tea.utils.StringUtils;
import com.yunshu.aggregationservices.aliyun.ProPerties.AliYunProperties;

/**
 * 校验阿里云短信服务相关参数
 */
public class AliYunSMSValidator {
    public static AliYunProperties validate(AliYunProperties properties) {
        if (properties == null)
            throw new IllegalArgumentException("阿里云短信服务相关参数不能为空！");
        if (StringUtils.isEmpty(properties.getAccessKeyId()) || StringUtils.isEmpty(properties.getAccessKeySecret()))
            throw new IllegalArgumentException("账号秘钥不能为空！");
        if (StringUtils.isEmpty(properties.getSignName()) || StringUtils.isEmpty(properties.getTemplateCode()))
            throw new IllegalArgumentException("签名和模版不能为空！");
        if (StringUtils.isEmpty(properties.getEndpoint()))
            properties.setEndpoint("dysmsapi.aliyuncs.com");
        return properties;
    }

}
