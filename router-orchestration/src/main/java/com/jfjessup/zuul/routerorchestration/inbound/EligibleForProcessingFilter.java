package com.jfjessup.zuul.routerorchestration.inbound;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfjessup.zuul.routerorchestration.http.eligibility.ProcessingEligibilityClient;
import com.jfjessup.zuul.routerorchestration.http.eligibility.model.ProcessingEligibilityResponse;
import com.jfjessup.zuul.routerorchestration.model.ExampleHttpRequest;
import com.netflix.zuul.filters.http.HttpInboundFilter;
import com.netflix.zuul.message.http.HttpRequestMessage;
import com.netflix.zuul.stats.status.StatusCategoryUtils;
import com.netflix.zuul.stats.status.ZuulStatusCategory;
import rx.Observable;
import rx.schedulers.Schedulers;

import javax.inject.Inject;
import java.util.concurrent.Callable;

public class EligibleForProcessingFilter extends HttpInboundFilter {

    private final ProcessingEligibilityClient processingEligibilityClient;
    private final ObjectMapper objectMapper;

    @Inject
    public EligibleForProcessingFilter(
            ProcessingEligibilityClient processingEligibilityClient,
            ObjectMapper objectMapper) {
        this.processingEligibilityClient = processingEligibilityClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public int filterOrder() {
        return 100;
    }

    @Override
    public Observable<HttpRequestMessage> applyAsync(HttpRequestMessage httpRequestMessage) {

        return Observable.fromCallable(new Callable<HttpRequestMessage>() {

            @Override
            public HttpRequestMessage call() throws Exception {
                ExampleHttpRequest request = objectMapper.readValue(httpRequestMessage.getBody(), ExampleHttpRequest.class);
                ProcessingEligibilityResponse resp =
                        processingEligibilityClient.callProcessingEligibility(request.getFirstName(), request.getLastName());

                if (!resp.isFilterIn()) {
                    StatusCategoryUtils.setStatusCategory(httpRequestMessage.getContext(), ZuulStatusCategory.FAILURE_CLIENT_BAD_REQUEST);
                }

                return httpRequestMessage;
            }
        })
                .subscribeOn(Schedulers.io());
    }

    @Override
    public boolean shouldFilter(HttpRequestMessage httpRequestMessage) {
        return true;
    }

    @Override
    public boolean needsBodyBuffered(HttpRequestMessage input) {
        return true;
    }
}
