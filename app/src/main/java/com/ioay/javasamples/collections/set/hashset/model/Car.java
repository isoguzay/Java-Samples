package com.ioay.javasamples.collections.set.hashset.model;

public class Car{

    private int carId;
    private String carBrand;

    public Car() {
    }

    public Car(int carId, String carBrand) {
        this.carId = carId;
        this.carBrand = carBrand;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    //get hash code for preventing same value entities
    @Override
    public int hashCode() {
        return this.carId;
    }

    // compare when same entities adding hashset
    @Override
    public boolean equals(Object obj) {
        if (this.carId == ((Car)obj).getCarId()){
            return true;
        }else{
            return false;
        }
    }
}
