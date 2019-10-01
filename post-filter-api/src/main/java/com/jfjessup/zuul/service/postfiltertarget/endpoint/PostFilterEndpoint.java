package com.jfjessup.zuul.service.postfiltertarget.endpoint;

import com.jfjessup.zuul.service.postfiltertarget.filter.PostFilter;
import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterRequest;
import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/post-filter")
public class PostFilterEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostFilterEndpoint.class);

    @Inject
    private PostFilter postFilter;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PostFilterResponse filter(PostFilterRequest request) {
        LOGGER.info("Received request with: {}", request);

        PostFilterResponse res = postFilter.filter(request);
        LOGGER.info("Responding with: {}", res);

        return res;
    }
}
