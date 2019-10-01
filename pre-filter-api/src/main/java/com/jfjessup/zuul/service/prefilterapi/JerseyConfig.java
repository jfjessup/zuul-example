package com.jfjessup.zuul.service.prefilterapi;

import com.jfjessup.zuul.service.prefilterapi.endpoint.PreFilterEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(PreFilterEndpoint.class);
    }
}
