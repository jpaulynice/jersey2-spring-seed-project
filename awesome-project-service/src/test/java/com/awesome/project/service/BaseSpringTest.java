package com.awesome.project.service;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;

import com.awesome.project.service.config.SpringTestConfig;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 *
 */
@Transactional
@ContextConfiguration(
        classes = SpringTestConfig.class)
public class BaseSpringTest extends AbstractTestNGSpringContextTests {
    // nothing to see here
}