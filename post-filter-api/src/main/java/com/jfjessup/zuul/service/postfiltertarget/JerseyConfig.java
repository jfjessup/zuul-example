package com.jfjessup.zuul.service.postfiltertarget;

import com.jfjessup.zuul.service.postfiltertarget.endpoint.PostFilterEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(PostFilterEndpoint.class);
    }
}
