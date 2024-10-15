package com.yunshu.aggregationservices.common;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

public class SMSConfigurationImportSelector implements ImportSelector {
 @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return Arrays.stream(SendType.values())
                .map(SendTypeMappings::getConfigurationClass)
                .toArray(String[]::new);
    }
}
