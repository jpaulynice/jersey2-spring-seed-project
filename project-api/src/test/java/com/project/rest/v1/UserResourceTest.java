package com.project.rest.v1;

import static com.project.config.Paths.USERS_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import javax.ws.rs.core.Response;

import org.testng.annotations.Test;

import com.project.config.BaseJerseyTest;
import com.project.model.Message;
import com.project.model.User;

/**
 * Test class for UserResource API. This uses the grizzly web server on port 0
 * to fire requests against the API.
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public class UserResourceTest extends BaseJerseyTest {
    /**
     * User found with id 123
     */
    @Test
    public void testGet() {
        final Response response = target(USERS_URL + "/123").request().get();

        assertNotNull(response);
        assertEquals(response.getStatus(), 200);
        final User dto = response.readEntity(User.class);

        final User expected = new User();
        expected.setId(123L);
        expected.setFirstName("Jay");
        expected.setLastName("Paulynice");
        expected.setUserName("jpaulynice");

        assertEquals(dto, expected);
    }

    /**
     * No user found test
     */
    @Test
    public void testGet404() {
        final Response response = target(USERS_URL + "/112").request().get();

        assertNotNull(response);
        assertEquals(response.getStatus(), 404);
        final Message found = response.readEntity(Message.class);

        final Message expected = new Message(404, "No user exists with id: 112");

        assertEquals(found, expected);
    }
}