package com.ioay.javasamples.samples;

import java.util.Scanner;

public class ElseIfStatements {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        double firstNumber, secondNumber, result;

        System.out.println("Choose your calculation type : \n1)Addition\n2)Minus\n3)Multiply\n4)Divide");

        int type = scan.nextInt();

        if (type == 1){
            System.out.println("Please enter your numbers for Addition:");
            System.out.println("First Number: ");
            firstNumber = scan.nextInt();
            System.out.println("Second Number: ");
            secondNumber = scan.nextInt();
            result = firstNumber + secondNumber;
            System.out.println("The result is " + result);
        }
        else if (type == 2){
            System.out.println("Please enter your numbers for Minus:");
            System.out.println("First Number: ");
            firstNumber = scan.nextInt();
            System.out.println("Second Number: ");
            secondNumber = scan.nextInt();
            result = firstNumber - secondNumber;
            System.out.println("The result is " + result);
        }
        else if (type == 3){
            System.out.println("Please enter your numbers for Multiply:");
            System.out.println("First Number: ");
            firstNumber = scan.nextInt();
            System.out.println("Second Number: ");
            secondNumber = scan.nextInt();
            result = firstNumber * secondNumber;
            System.out.println("The result is " + result);
        }
        else if (type == 4){
            System.out.println("Please enter your numbers for Divide:");
            System.out.println("First Number: ");
            firstNumber = scan.nextInt();
            System.out.println("Second Number: ");
            secondNumber = scan.nextInt();
            result = firstNumber / secondNumber;
            System.out.println("The result is " + result);
        }
        else{
            System.out.println("Please enter your calculation value between 1 to 4.");
        }
    }
}
