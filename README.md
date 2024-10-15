## 项目介绍

该项目集成了阿里云和腾讯云的短信sdk，并进行了简单的封装，现在你可以通过配置和spring注入，一键发送短信验证码。

## 导入

```xml
<dependency>
    <groupId>io.github.somefornull</groupId>
    <artifactId>third-sms-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
_**不支持2.6.x的springboot版本，请使用2.7.x ！！！！！**_
## 配置使用

```yaml
aggregation:
  send-type: aliyun
  aliyun:
    access-key-id: xxxxxxxxxxxxxxxxxx
    access-key-secret: xxxxxxxxxxxxxxxxxx
    endpoint: xxxxxxxxxxxxxxxxxx(可以默认不填)
    sign-name: xxxx
    template-code: xxxx
```

## 例子

```java
@SpringBootTest
class SdktestApplicationTests {
    @Autowired
    SMSClient smsClient;
    @Test
    void contextLoads() {
        smsClient.send("1234567890","123456");
    }

}

```