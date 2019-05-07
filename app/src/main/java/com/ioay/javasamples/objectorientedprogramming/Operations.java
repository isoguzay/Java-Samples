package com.ioay.javasamples.objectorientedprogramming;

public class Operations {

    public double calculateAverage(double... numbers) {
        double result = 0;
        for (Double num : numbers) {
            result = result + num;
        }
        System.out.println(result/ numbers.length);
        return result;
    }

}
