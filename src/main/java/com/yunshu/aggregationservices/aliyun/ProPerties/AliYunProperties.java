package com.yunshu.aggregationservices.aliyun.ProPerties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "aggregation.aliyun")
public class AliYunProperties {
    /**
     * 阿里云的AccessKeyId
     */
    private String accessKeyId;
    /**
     * 阿里云的AccessKeySecret
     */
    private String accessKeySecret;
    /**
     * 阿里云的Endpoint
     */
    private String endpoint;
    /**
     * 阿里云的签名
     */
    private String signName;
    /**
     * 阿里云的模板ID
     */
    private String templateCode;

    public AliYunProperties() {
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
