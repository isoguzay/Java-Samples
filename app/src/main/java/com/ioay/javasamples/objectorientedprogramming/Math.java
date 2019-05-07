package com.ioay.javasamples.objectorientedprogramming;

public class Math {

    public void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    public int addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public int minus(int num1, int num2, String name) {
        int result = num1 - num2;
        System.out.println("Operation triggered by " + name + "\n" + result);
        return result;
    }
}
