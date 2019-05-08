package com.ioay.javasamples.examples.compositionsample.model;

public class Person {

    private String personName;
    private int personPhone;
    private Address address;

    public Person() {
    }

    public Person(String personName, int personPhone, Address address) {
        this.personName = personName;
        this.personPhone = personPhone;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(int personPhone) {
        this.personPhone = personPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
