package com.jfjessup.zuul.service.downstreamapi;

import com.jfjessup.zuul.service.downstreamapi.endpoint.DownstreamAPIEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(DownstreamAPIEndpoint.class);
    }
}
