package com.yunshu.aggregationservices.common;

import com.yunshu.aggregationservices.aliyun.config.ALiYunConfiguration;
import com.yunshu.aggregationservices.tenxunyun.config.TenXunYunConfiguration;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
public class SendTypeMappings {
    private static final Map<SendType, Configurations> MAPPINGS;

    static {
        Map<SendType, Configurations> mappings = new EnumMap<>(SendType.class);
        mappings.put(SendType.AliYun, new Configurations(ALiYunConfiguration.class));
        mappings.put(SendType.TenXunYun, new Configurations(TenXunYunConfiguration.class));
        MAPPINGS = Collections.unmodifiableMap(mappings);
    }

    static String getConfigurationClass(SendType sendType) {
        SendTypeMappings.Configurations configurations = MAPPINGS.get(sendType);
        Assert.state(configurations != null, () -> "Unknown sms send type " + sendType);
        return configurations.getConfiguration();
    }

    private static class Configurations {

        private final Class<?> thirdConfiguration;

        Configurations(Class<?> thirdConfiguration) {
            this.thirdConfiguration = thirdConfiguration;
        }

        String getConfiguration() {
            return getName(thirdConfiguration);
        }

        String getName(Class<?> configuration) {
            return (configuration != null) ? configuration.getName() : null;
        }

    }
}
