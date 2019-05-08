package com.ioay.javasamples.examples.salarycalculator;

public class Salary {

    int workHour;

    public int calculateSalary(int workHour) {

        int shiftHour = (workHour * 8) - 160;

        int shiftSalary = shiftHour * 10;

        int salary = 1750 + shiftSalary;

        return salary;
    }

}
