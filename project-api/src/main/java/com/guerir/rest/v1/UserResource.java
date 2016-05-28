package com.project.rest.v1;

import static com.project.config.Paths.USERS_URL;
import static com.project.config.Paths.USER_ID;
import static com.project.config.Paths.USER_ID_PARAM;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.User;
import com.project.service.UserService;

/**
 * Resource end point to do operations such as create, update, delete and fetch
 * user details.
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Component
@Path(USERS_URL)
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class UserResource {
    private final UserService service;

    /**
     * Default constructor with dependencies injected
     *
     * @param service the service
     */
    @Autowired
    public UserResource(final UserService service) {
        this.service = service;
    }

    @GET
    @Path(USER_ID_PARAM)
    public Response get(@PathParam(USER_ID) final Long id) {
        final User dto = service.getUser(id);
        return Response.ok(dto).build();
    }
}