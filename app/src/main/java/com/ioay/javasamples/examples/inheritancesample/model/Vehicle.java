package com.ioay.javasamples.examples.inheritancesample.model;

public class Vehicle {

    private String color;
    private String shiftType;

    public Vehicle() {
        super();
        System.out.println("Vehicle constructor is running!");
    }

    public Vehicle(String color, String shiftType) {
        super();
        this.color = color;
        this.shiftType = shiftType;
        System.out.println("Vehicle constructor2 is running!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }
}
