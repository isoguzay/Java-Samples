package com.ioay.javasamples.examples.collectionsample.example5.model;

public class Address {

    private String city;
    private String county;

    public Address() {
    }

    public Address(String city, String county) {
        this.city = city;
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
