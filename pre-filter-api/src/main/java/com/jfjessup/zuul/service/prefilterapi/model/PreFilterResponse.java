package com.jfjessup.zuul.service.prefilterapi.model;

public class PreFilterResponse {

    private String givenText;
    private boolean filterIn;

    public PreFilterResponse(String givenText, boolean shouldFilterIn) {
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
