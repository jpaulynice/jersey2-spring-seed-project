package com.project.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

import com.project.rest.provider.AppExceptionMapper;
import com.project.rest.v1.UserResource;

/**
 * Jersey application configuration for our rest api
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public class JerseyApplication extends ResourceConfig {
    /**
     * default constructor
     */
    public JerseyApplication() {
        register(RequestContextFilter.class);
        register(AppExceptionMapper.class);
        register(UserResource.class);
    }
}