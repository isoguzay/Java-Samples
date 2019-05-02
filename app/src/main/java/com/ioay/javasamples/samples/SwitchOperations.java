package com.ioay.javasamples.samples;

import java.util.Scanner;

public class SwitchOperations {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a type : \n1)Addition\n2)Minus\n3)Multiply\n4)Divide");

        int type = scan.nextInt();

        double firstNumber, secondNumber, result;

        switch (type){
            case 1 :
                System.out.println("First Number: ");
                firstNumber = scan.nextInt();
                System.out.println("Second Number");
                secondNumber = scan.nextInt();
                result = firstNumber + secondNumber;
                System.out.println("The result is " + result);
                break;
            case 2 :
                System.out.println("First Number: ");
                firstNumber = scan.nextInt();
                System.out.println("Second Number");
                secondNumber = scan.nextInt();
                result = firstNumber - secondNumber;
                System.out.println("The result is " + result);
                break;
            case 3 :
                System.out.println("First Number: ");
                firstNumber = scan.nextInt();
                System.out.println("Second Number");
                secondNumber = scan.nextInt();
                result = firstNumber * secondNumber;
                System.out.println("The result is " + result);
                break;
            case 4 :
                System.out.println("First Number: ");
                firstNumber = scan.nextInt();
                System.out.println("Second Number");
                secondNumber = scan.nextInt();
                result = firstNumber / secondNumber;
                System.out.println("The result is " + result);
                break;
            default :
                System.out.println("Wrong operation type !! Please enter enable type value !! ");
                break;
        }
    }
}
