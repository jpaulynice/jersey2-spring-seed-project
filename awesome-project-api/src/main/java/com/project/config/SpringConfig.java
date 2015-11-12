package com.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * Spring configuration using annotation replacing 'applicationContext.xml'
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Configuration
@ComponentScan(
        basePackages = { "com.project.service",
                "com.project.rest" },
        excludeFilters = @Filter(
                type = FilterType.REGEX,
                pattern = "com.project.config.*"))
@Import({ SpringDataConfig.class })
public class SpringConfig {

}