package com.ioay.javasamples.collections.set.hashset.main;

import com.ioay.javasamples.collections.set.hashset.model.Car;

import java.util.Collections;
import java.util.HashSet;

public class HashSetObjectMain {

    public static void main(String args[]){

        HashSet<Car> carHashSet = new HashSet<>();

        Car car = new Car(34,"Fiat");
        Car car1 = new Car(12, "Opel");
        Car car2 = new Car(33, "Porsche");
        Car car3 = new Car(1,"Ferrari");

        carHashSet.add(car);
        carHashSet.add(car1);
        carHashSet.add(car2);
        carHashSet.add(car3);

        Car car4 = new Car(35,"Toyota");

        System.out.println(car3);

        carHashSet.add(car4);

        for (Car c : carHashSet){
            System.out.println("///////");
            System.out.println("Car Id: " + c.getCarId());
            System.out.println("Car Brand : " + c.getCarBrand()+"\n");
        }
    }
}
