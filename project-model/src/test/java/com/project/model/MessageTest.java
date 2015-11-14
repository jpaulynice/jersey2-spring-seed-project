package com.project.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class MessageTest {
    @Test
    public void test() {
        final Message m = new Message();
        m.setInfo("exception occurred");
        m.setStatus(500);

        assertEquals(m.getStatus(), 500);
        assertEquals(m.getInfo(), "exception occurred");
        assertNotNull("Message " + m);
        assertNotNull(m.hashCode());

        final Message m2 = new Message(500, "exception occurred");
        assertEquals(m, m2);
    }
}
