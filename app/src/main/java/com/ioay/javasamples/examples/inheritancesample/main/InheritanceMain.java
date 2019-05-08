package com.ioay.javasamples.examples.inheritancesample.main;

import com.ioay.javasamples.examples.inheritancesample.model.Car;
import com.ioay.javasamples.examples.inheritancesample.model.Mercedes;

public class InheritanceMain {

    public static void main(String args[]) {

        Car car = new Car();

        car.setCarType("HB");
        car.setColor("Black");
        car.setShiftType("Manuel");

        System.out.println(car.getColor());

        Mercedes mercedes = new Mercedes("1600");

        mercedes.setCarType("HB");
        mercedes.setColor("White");
        mercedes.setShiftType("Manuel");

        System.out.println(mercedes.getHorsePower()+ "\n");

        car.getInfo();
    }
}
