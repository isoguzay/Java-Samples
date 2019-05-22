package com.ioay.javasamples.examples.castingsample.main;

import com.ioay.javasamples.examples.inheritancesample.model.Car;
import com.ioay.javasamples.examples.inheritancesample.model.Mercedes;

public class CastingMain {

    public static void main(String args[]){

        Mercedes mercedes = new Mercedes();

        Car car = mercedes; //up casting

        Car car1 = new Car();

        Mercedes mercedes1 = (Mercedes) car1; // down casting

    }
}
