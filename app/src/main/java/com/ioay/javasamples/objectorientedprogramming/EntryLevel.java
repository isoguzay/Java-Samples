package com.ioay.javasamples.objectorientedprogramming;

public class EntryLevel {

    public static void main(String args[]) {

        int age = 27;

        Car car = new Car();

        car.model = "BMW";
        car.enginePower = 3.20;
        car.maxSpeed = 260;
        car.isStartPower=true;

        Car car2 = new Car();

        car2.model = "Mercedes";
        car2.maxSpeed = 260;
        car2.enginePower = 3.00;
        car2.isStartPower = false;
        car2.carSpeed = 0;

        car2.startPower();

        car2.stopCar();
        car2.speedUp(50);
        car2.speedDown(60);

        System.out.println("Car model is " + car2.model + "\nMax speed : " + car2.maxSpeed +
                "\nCar Power Status : " + car2.isStartPower + "\nCar speed : " + car2.carSpeed);
    }
}
