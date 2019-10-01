package com.jfjessup.zuul.routerorchestration.http.eligibility;

import com.jfjessup.zuul.routerorchestration.http.eligibility.model.ProcessingEligibilityRequest;
import com.jfjessup.zuul.routerorchestration.http.eligibility.model.ProcessingEligibilityResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@Component
public class ProcessingEligibilityClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessingEligibilityClient.class);

    private final RestTemplate restTemplate;

    @Inject
    public ProcessingEligibilityClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ProcessingEligibilityResponse callProcessingEligibility(String firstName, String lastName) {
        ProcessingEligibilityRequest request = new ProcessingEligibilityRequest(firstName + lastName, true);
        LOGGER.info("Calling Processing Eligibility API with {}", request);

        ProcessingEligibilityResponse resp = restTemplate.postForObject(
                "http://localhost:9090/pre-filter", request, ProcessingEligibilityResponse.class);
        LOGGER.info("Retrieved Processing Eligibility response with: {}", resp);

        return resp;
    }
}
