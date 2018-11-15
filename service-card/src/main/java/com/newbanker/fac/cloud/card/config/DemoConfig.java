package com.newbanker.fac.cloud.card.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 */
@Component
@Data
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {

    private String title;
}
