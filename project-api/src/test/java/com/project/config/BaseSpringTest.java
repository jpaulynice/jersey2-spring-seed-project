package com.project.config;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;

/**
 * Base class for spring dependency unit testing.
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Transactional
@ContextConfiguration(
        classes = TestConfig.class)
public abstract class BaseSpringTest extends AbstractTestNGSpringContextTests {
    // nothing to see here
}