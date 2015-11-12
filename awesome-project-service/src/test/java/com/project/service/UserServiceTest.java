package com.project.service;

import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.project.exception.UserNotFoundException;
import com.project.service.UserService;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public class UserServiceTest extends BaseSpringTest {
    @Autowired
    private UserService service;

    /**
     * test service not null
     */
    @Test
    public void testNotNull() {
        assertNotNull(service);
    }

    /**
     * test get
     */
    @Test
    public void testGet() {
        assertNotNull(service.getUser(123L));
    }

    /**
     * test get with exception
     */
    @Test(
            expectedExceptions = { UserNotFoundException.class })
    public void testGetException() {
        service.getUser(1455L);
    }
}