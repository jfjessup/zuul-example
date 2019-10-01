package com.jfjessup.zuul.service.prefilterapi.endpoint;

import com.jfjessup.zuul.service.prefilterapi.model.PreFilterRequest;
import com.jfjessup.zuul.service.prefilterapi.model.PreFilterResponse;
import com.jfjessup.zuul.service.prefilterapi.filter.PreFilter;
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
@Path("/pre-filter")
public class PreFilterEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreFilterEndpoint.class);

    @Inject
    private PreFilter preFilter;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PreFilterResponse filter(PreFilterRequest request) {
        LOGGER.info("Received request with: {}", request);

        PreFilterResponse res = preFilter.filter(request);
        LOGGER.info("Responding with: {}", res);

        return res;
    }
}
