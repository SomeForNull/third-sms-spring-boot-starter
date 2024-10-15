package com.yunshu.aggregationservices.aliyun.strategy;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.yunshu.aggregationservices.aliyun.AliYunSMSValidator;
import com.yunshu.aggregationservices.aliyun.ProPerties.AliYunProperties;
import com.yunshu.aggregationservices.common.SMSStrategy;

import static com.aliyun.teautil.Common.toJSONString;

public class ALiYunDefaultStrategy implements SMSStrategy {
    @Override
    public void send(Object properties, String phone, String content) {
        AliYunProperties properties1 = AliYunSMSValidator.validate((AliYunProperties) properties);
        try {
            Config config = new Config()
                    .setEndpoint(properties1.getEndpoint())
                    .setAccessKeyId(properties1.getAccessKeyId())
                    .setAccessKeySecret(properties1.getAccessKeySecret());
            com.aliyun.dysmsapi20170525.Client client = new Client(config);
            String template="{\n" +
                    "    \"code\": \"%s\"\n" +
                    "}";
            String templateCode = String.format(template, content);
            // 构造请求对象，请填入请求参数值
            SendSmsRequest sendSmsRequest = new SendSmsRequest()
                    .setPhoneNumbers(phone)
                    .setSignName(properties1.getSignName())
                    .setTemplateCode(properties1.getTemplateCode())
                    .setTemplateParam(templateCode);
            SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
            // 响应包含服务端响应的 body 和 headers
            System.out.println(toJSONString(sendSmsResponse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



