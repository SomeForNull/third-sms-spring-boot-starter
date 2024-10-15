package com.yunshu.aggregationservices.tenxunyun.ProPerties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aggregation.tenxunyun")

public class TenXunYunProperties {
    /**
     * 腾讯云的AccessKeyId
     */
    private String accessKeyId;
    /**
     * 腾讯云的AccessKeySecret
     */
    private String accessKeySecret;
    /**
     * 腾讯云的AppID
     */
    private String appId;
    /**
     * 腾讯云的Endpoint
     */
    private String endpoint;
    /**
     * 腾讯云的签名
     */
    private String signName;
    /**
     * 腾讯云的模板ID
     */
    private String templateCode;

    public TenXunYunProperties() {
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appID) {
        this.appId = appID;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
