package com.jfjessup.zuul.service.downstreamapi.endpoint;

import com.jfjessup.zuul.service.downstreamapi.model.DownstreamAPIRequest;
import com.jfjessup.zuul.service.downstreamapi.model.DownstreamAPIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/downstream-api")
public class DownstreamAPIEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(DownstreamAPIEndpoint.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public DownstreamAPIResponse endpoint(DownstreamAPIRequest request) {
        LOGGER.info("Received request with: {}", request);

        DownstreamAPIResponse res = new DownstreamAPIResponse(request.getFirstName(), request.getLastName());
        LOGGER.info("Responding with: {}", res);

        return res;
    }
}
