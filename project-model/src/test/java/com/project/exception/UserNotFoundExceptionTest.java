package com.project.exception;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UserNotFoundExceptionTest {
    @Test
    public void test() {
        final UserNotFoundException e = new UserNotFoundException(
                "no user found with id: 1");
        assertEquals(e.getStatus(), 404);
        assertEquals(e.getMessage(), "no user found with id: 1");

        final UserNotFoundException e2 = new UserNotFoundException(
                "no user found with id: 45", new RuntimeException());
        assertEquals(e2.getStatus(), 404);
        assertEquals(e2.getMessage(), "no user found with id: 45");
    }
}
