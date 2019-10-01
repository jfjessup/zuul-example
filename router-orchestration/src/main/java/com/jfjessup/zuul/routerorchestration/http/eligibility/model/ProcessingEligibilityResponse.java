package com.jfjessup.zuul.routerorchestration.http.eligibility.model;

public class ProcessingEligibilityResponse {

    private String givenText;
    private boolean filterIn;

    public ProcessingEligibilityResponse(String givenText, boolean shouldFilterIn) {
        this.givenText = givenText;
        this.filterIn = shouldFilterIn;
    }

    public String getGivenText() {
        return givenText;
    }

    public void setGivenText(String givenText) {
        this.givenText = givenText;
    }

    public boolean isFilterIn() {
        return filterIn;
    }

    public void setFilterIn(boolean filterIn) {
        this.filterIn = filterIn;
    }

    @Override
    public String toString() {
        return "PreFilterResponse{" +
                "givenText='" + givenText + '\'' +
                ", filterIn=" + filterIn +
                '}';
    }
}
