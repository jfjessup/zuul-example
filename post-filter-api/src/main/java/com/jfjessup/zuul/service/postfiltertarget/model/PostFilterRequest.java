package com.jfjessup.zuul.service.postfiltertarget.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PostFilterRequest {

    private String text;
    private String value;

    public PostFilterRequest(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PostFilterRequest{" +
                "text='" + text + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
