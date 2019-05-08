package com.ioay.javasamples.examples.inheritancesample.model;

public class Car extends Vehicle {

    private String carType;

    public Car() {
        super();
        System.out.println("Car constructor is running!");
    }

    public Car(String carType) {
        super("Blue","Automatic");
        this.carType = carType;
        System.out.println("Car constructor2 is running!");
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void getInfo() {
        System.out.println(carType);
        System.out.println(super.getColor());
        System.out.println(super.getShiftType());
    }
}
