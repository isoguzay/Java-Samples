package com.ioay.javasamples.examples.salarycalculator;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        Salary salary = new Salary();

        System.out.println("Please enter your shift hour : ");

        salary.workHour = scan.nextInt();

        int total = salary.calculateSalary(salary.workHour);

        System.out.println("Salary Total : " + total);

    }
}
