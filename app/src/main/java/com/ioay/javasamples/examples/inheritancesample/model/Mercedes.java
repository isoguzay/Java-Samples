package com.ioay.javasamples.examples.inheritancesample.model;

public class Mercedes extends Car {

    private String horsePower;

    public Mercedes(){
        super("Sedan");
        System.out.println("Mercedes constructor is running!");
    }

    public Mercedes(String horsePower) {
        super();
        this.horsePower = horsePower;
        System.out.println("Mercedes constructor2 is running!");
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }
}
