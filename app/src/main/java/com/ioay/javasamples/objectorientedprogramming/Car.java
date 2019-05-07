package com.ioay.javasamples.objectorientedprogramming;

public class Car {
    String model;
    int maxSpeed;
    int carSpeed;
    double enginePower;
    boolean isStartPower;

    public void startPower() {
        isStartPower = true;
    }

    public void stopCar() {
        isStartPower = false;
    }

    public void speedUp(int speed) {
        carSpeed = carSpeed + speed;
    }

    public void speedDown(int speed) {
        carSpeed = carSpeed - speed;

        if (carSpeed <= 0) {
            carSpeed = 0;
        }
    }
}
