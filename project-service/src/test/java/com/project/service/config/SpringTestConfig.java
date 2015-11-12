package com.project.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(
        basePackages = { "com.project.service",
                "com.project.repository" },
        excludeFilters = @Filter(
                type = FilterType.REGEX,
                pattern = "com.project.service.config.*"))
@Import({ SpringDataTestConfig.class })
public class SpringTestConfig {

}