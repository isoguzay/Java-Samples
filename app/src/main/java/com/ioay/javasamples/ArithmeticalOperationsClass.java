package com.ioay.javasamples;

public class ArithmeticalOperationsClass {

    public static void main(String args[]){

        int sum = 80;
        sum = sum + 20;
        sum += 20;

        System.out.println(sum);

        int multiplex = 35;
        multiplex *= 34;

        System.out.println(multiplex);

        int number1 = 7;
        int number2 = ++number1;
        int number3 = --number1;

        System.out.println("Number 1 : " + number1 + "\nNumber 2 : " + number2 + "\nNumber 3 : " + number3);

        int number4 = 3;
        int number5 = number4++;
        int number6 = number4++;

        System.out.println("Number 4 : " + number4 + "\nNumber 5 : " + number5 + "\nNumber 6 : " + number6);

    }
}
