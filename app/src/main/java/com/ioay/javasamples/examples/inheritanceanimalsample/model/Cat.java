package com.ioay.javasamples.examples.inheritanceanimalsample.model;

public class Cat extends  Mammal {

    @Override
    public void makeNoise() {
        System.out.println("mmm mmm !!!");
    }
}
