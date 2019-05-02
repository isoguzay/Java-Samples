package com.ioay.javasamples.samples;

import java.util.Random;
import java.util.Scanner;

public class IfStatements {

    public static void main(String args[]){

        int x = 0 ;

        if(x >= 0){
            System.out.println("Number is higher than 0 or equal to 0. Our Number is " + x);
        }
        else {
            System.out.println("Number is lower than 0. Sorry about that.");
        }

        Random rand = new Random();

        int number = rand.nextInt(9);

        if(number > 0){
            System.out.println("Your number is higher than 0. Number is " + number);
        }
        else{
            System.out.println("Ooppss ! Your number is 0.");
        }

        int password = 1234;
        String userName = "admin";

        if(password==1234 && userName.equals("admin")){
            System.out.println("Login is success!");
        }
        else {
            System.out.println("Login is failed!");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a type : \n1)Calculate a square\n2)Calculate a circle\n3)Calculate a rectangle");

        int type = scan.nextInt();

        if(type == 1){
            System.out.println("Please enter a number for calculating a square");
            int square = scan.nextInt();
            int squareCal = square * square ;
            System.out.println("The result is " + squareCal);
        }else if (type == 2){
            System.out.println("Please enter a number for calculating a circle");
            int circle = scan.nextInt();
            int circleCal = (int)((circle*circle) * 3.14);
            System.out.println("The result is " + circleCal);
        }else if (type == 3){
            System.out.println("Please enter two number for calcualating rectangle");
            System.out.println("Enter a value for short side");
            int a = scan.nextInt();
            System.out.println("Enter a value for long side");
            int b = scan.nextInt();
            int rectangleCal = a * b ;
            System.out.println("The result is " + rectangleCal);
        }
        else{
            System.out.println("Please enter a number between 1 or 2 or 3!");
        }
    }
}
