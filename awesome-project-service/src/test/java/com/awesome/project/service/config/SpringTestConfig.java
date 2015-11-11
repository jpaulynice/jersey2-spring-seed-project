package com.awesome.project.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(
        basePackages = { "com.awesome.project.service",
                "com.awesome.project.repository" },
        excludeFilters = @Filter(
                type = FilterType.REGEX,
                pattern = "com.awesome.project.service.config.*"))
@Import({ SpringDataTestConfig.class })
public class SpringTestConfig {

}