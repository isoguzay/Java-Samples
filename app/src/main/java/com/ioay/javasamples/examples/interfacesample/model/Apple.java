package com.ioay.javasamples.examples.interfacesample.model;

public class Apple implements Eatable,Squueezable {

    @Override
    public void howToEat() {
        System.out.println("Wash and eat");
    }

    @Override
    public void howToSquueeze() {
        System.out.println("Cut and get juice");
    }
}
