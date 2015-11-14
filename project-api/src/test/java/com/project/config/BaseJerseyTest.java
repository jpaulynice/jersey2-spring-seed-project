package com.project.config;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Base test class for all jersey unit tests
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public abstract class BaseJerseyTest extends JerseyTest {
    /*
     * (non-Javadoc)
     * @see org.glassfish.jersey.test.JerseyTest#setUp()
     */
    @Override
    @BeforeClass
    public void setUp() throws Exception {
        super.setUp();
    }

    /*
     * (non-Javadoc)
     * @see org.glassfish.jersey.test.JerseyTest#tearDown()
     */
    @Override
    @AfterClass
    public void tearDown() throws Exception {
        super.tearDown();
    }

    /*
     * (non-Javadoc)
     * @see org.glassfish.jersey.test.JerseyTest#configure()
     */
    @Override
    protected Application configure() {
        forceSet(TestProperties.CONTAINER_PORT, "0");
        return new JerseyApplication().property("contextConfig",
                new AnnotationConfigApplicationContext(TestConfig.class));
    }
}