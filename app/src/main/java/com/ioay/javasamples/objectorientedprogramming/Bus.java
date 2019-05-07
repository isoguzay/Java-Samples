package com.ioay.javasamples.objectorientedprogramming;

public class Bus {

    String model;
    int capacity;
    int passengerCount;
    String route;


    public void increasePassenger(int passanger) {
        passengerCount = passengerCount + passanger;

        if (passengerCount > capacity) {
            System.out.println("Max passanger count !");
        } else {
            System.out.println("Passanger count : " + passengerCount);
        }
    }

    public void decreasePassenger(int passenger) {
        passengerCount = passengerCount + passenger;

        if (passengerCount <= 0) {
            System.out.println("Nobody at the bus !");
        } else {
            System.out.println("Passanger count : " + passengerCount);
        }
    }

    public void getInfo() {
        System.out.println("Bus model : " + model + "\nCapacity : "
                + capacity + "\nPassenger count : " + passengerCount);
    }

}
