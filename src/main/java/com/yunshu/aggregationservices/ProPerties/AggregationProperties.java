package com.yunshu.aggregationservices.ProPerties;
import com.yunshu.aggregationservices.common.SendType;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "aggregation")
public class AggregationProperties {
    /**
     * 短信发送类型
     */
    private SendType sendType;

    public SendType getSendType() {
        return sendType;
    }

    public void setSendType(SendType sendType) {
        this.sendType = sendType;
    }
}
