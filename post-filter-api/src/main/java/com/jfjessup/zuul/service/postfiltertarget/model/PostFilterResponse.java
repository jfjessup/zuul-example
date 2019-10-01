package com.jfjessup.zuul.service.postfiltertarget.model;

public class PostFilterResponse {

    private String givenText;
    private String enrichmentValue;

    public PostFilterResponse(String givenText, String enrichmentValue) {
        this.givenText = givenText;
        this.enrichmentValue = enrichmentValue;
    }

    public String getGivenText() {
        return givenText;
    }

    public void setGivenText(String givenText) {
        this.givenText = givenText;
    }

    public String getEnrichmentValue() {
        return enrichmentValue;
    }

    public void setEnrichmentValue(String enrichmentValue) {
        this.enrichmentValue = enrichmentValue;
    }

    @Override
    public String toString() {
        return "PostFilterResponse{" +
                "givenText='" + givenText + '\'' +
                ", enrichmentValue='" + enrichmentValue + '\'' +
                '}';
    }
}
