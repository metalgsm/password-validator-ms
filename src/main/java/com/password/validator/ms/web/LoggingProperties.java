package com.password.validator.ms.web;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("laboratory.web.logging")
@Data
public class LoggingProperties {

    private List<String> ignoredPathPrefixes;

}
