package com.jfjessup.zuul.routerorchestration.http.downstream;

import com.jfjessup.zuul.routerorchestration.http.downstream.model.DownstreamAPIRequest;
import com.jfjessup.zuul.routerorchestration.http.downstream.model.DownstreamAPIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@Component
public class DownstreamAPIClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(DownstreamAPIClient.class);

    private final RestTemplate restTemplate;

    @Inject
    public DownstreamAPIClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DownstreamAPIResponse callDownstreamAPI(String firstName, String lastName) {
        DownstreamAPIRequest request = new DownstreamAPIRequest(firstName, lastName);
        LOGGER.info("Calling Downstream API with: {}", request);

        DownstreamAPIResponse resp = restTemplate.postForObject(
                "https://localhost:9091/downstream-api", request, DownstreamAPIResponse.class);
        LOGGER.info("Retrieved Downstream API response with: {}", resp);

        return resp;
    }
}
