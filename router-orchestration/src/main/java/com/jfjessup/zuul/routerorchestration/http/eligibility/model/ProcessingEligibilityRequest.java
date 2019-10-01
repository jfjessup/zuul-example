package com.jfjessup.zuul.routerorchestration.http.eligibility.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProcessingEligibilityRequest {

    private String text;
    private boolean filterIn;

    public ProcessingEligibilityRequest(String text, boolean shouldFilterIn) {
        this.text = text;
        this.filterIn = shouldFilterIn;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFilterIn() {
        return filterIn;
    }

    public void setFilterIn(boolean filterIn) {
        this.filterIn = filterIn;
    }

    @Override
    public String toString() {
        return "PreFilterRequest{" +
                "text='" + text + '\'' +
                ", filterIn=" + filterIn +
                '}';
    }
}
