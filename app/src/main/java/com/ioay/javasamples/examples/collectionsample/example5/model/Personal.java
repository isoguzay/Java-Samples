package com.ioay.javasamples.examples.collectionsample.example5.model;

public class Personal {

    private int personalNo;
    private String personalName;
    private Address personalAddress;

    public Personal() {
    }

    public Personal(int personalNo, String personalName, Address personalAddress) {
        this.personalNo = personalNo;
        this.personalName = personalName;
        this.personalAddress = personalAddress;
    }

    public int getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(int personalNo) {
        this.personalNo = personalNo;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public Address getPersonalAddress() {
        return personalAddress;
    }

    public void setPersonalAddress(Address personalAddress) {
        this.personalAddress = personalAddress;
    }
}
