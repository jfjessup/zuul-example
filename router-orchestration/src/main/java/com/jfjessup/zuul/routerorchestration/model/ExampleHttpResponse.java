package com.jfjessup.zuul.routerorchestration.model;

public class ExampleHttpResponse {
    private String firstName;
    private String lastName;
    private String data;

    public ExampleHttpResponse(String firstName, String lastName, String data) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.data = data;
    }

    public ExampleHttpResponse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
