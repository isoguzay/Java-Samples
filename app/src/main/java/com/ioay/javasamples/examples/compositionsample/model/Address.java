package com.ioay.javasamples.examples.compositionsample.model;

public class Address {

    private String cityName;
    private String countyName;


    public Address() {
    }

    public Address(String cityName, String countyName) {
        this.cityName = cityName;
        this.countyName = countyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }


}
