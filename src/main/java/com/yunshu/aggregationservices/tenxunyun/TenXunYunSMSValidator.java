package com.yunshu.aggregationservices.tenxunyun;

import com.aliyun.tea.utils.StringUtils;
import com.yunshu.aggregationservices.tenxunyun.ProPerties.TenXunYunProperties;

/**
 * 校验腾讯短信服务相关参数
 */
public class TenXunYunSMSValidator {
    public static TenXunYunProperties validate(TenXunYunProperties properties){
        if (properties == null)
            throw new IllegalArgumentException("腾讯云短信服务相关参数不能为空！");
        if (StringUtils.isEmpty(properties.getAccessKeyId()) || StringUtils.isEmpty(properties.getAccessKeySecret()))
            throw new IllegalArgumentException("账号秘钥不能为空！");
        if (StringUtils.isEmpty(properties.getSignName())|| StringUtils.isEmpty(properties.getTemplateCode()))
            throw new IllegalArgumentException("签名和模版不能为空！");
        if (StringUtils.isEmpty(properties.getAppId()))
            throw new IllegalArgumentException("签名和模版不能为空！");
        if (StringUtils.isEmpty(properties.getEndpoint()))
            properties.setEndpoint("sms.tencentcloudapi.com");
        return properties;
    }

}
