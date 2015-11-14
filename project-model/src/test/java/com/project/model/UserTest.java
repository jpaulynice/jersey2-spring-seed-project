package com.project.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class UserTest {
    @Test
    public void test() {
        final long id = 234L;
        final User u = new User();
        u.setFirstName("Joe");
        u.setId(id);
        u.setLastName("Buddy");
        u.setUserName("jbuddy");

        final long idd = u.getId();
        assertEquals(idd, id);
        assertEquals(u.getFirstName(), "Joe");
        assertEquals(u.getLastName(), "Buddy");
        assertEquals(u.getUserName(), "jbuddy");

        assertNotNull("User: " + u);
        assertEquals(u, u);
        assertNotNull(u.hashCode());
    }
}