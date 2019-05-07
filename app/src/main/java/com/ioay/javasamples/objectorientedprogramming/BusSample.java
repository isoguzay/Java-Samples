package com.ioay.javasamples.objectorientedprogramming;

public class BusSample {

    public static void main(String args[]) {

        Bus busExpress = new Bus();

        busExpress.model = "Mercedes";
        busExpress.route = "Berlin";
        busExpress.capacity = 35;
        busExpress.passengerCount = 0;

        Bus busExpress2 = new Bus();

        busExpress2.model = "Otokar";
        busExpress2.route = "Istanbul";
        busExpress2.capacity = 25;
        busExpress2.passengerCount = 1;

        busExpress2.getInfo();

        busExpress2.increasePassenger(15);

        busExpress2.increasePassenger(25);

    }
}
