package com.ioay.javasamples.examples.interfacesample.model;

public class Chicken implements Eatable {

    @Override
    public void howToEat() {
        System.out.println("Middle range cook with 100 C.");
    }
}
