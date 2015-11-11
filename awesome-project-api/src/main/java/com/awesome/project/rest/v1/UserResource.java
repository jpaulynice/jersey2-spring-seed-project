package com.awesome.project.rest.v1;

import static com.awesome.project.config.Paths.USERS_URL;
import static com.awesome.project.config.Paths.USER_ID;
import static com.awesome.project.config.Paths.USER_ID_PARAM;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.awesome.project.model.User;
import com.awesome.project.service.UserService;

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