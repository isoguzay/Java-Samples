package com.ioay.javasamples.samples;

import java.util.Scanner;

public class FindEvenOrOddNumber {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a value for controlling even or odd");

            int input = scan.nextInt();

            int result = input % 2;

            switch (result){
                case 0 :
                    System.out.println("Input is Even ! ");
                    break;
                case 1 :
                    System.out.println("Input is Odd ! ");
                    break;
            }

            System.out.println("Enter 1 for Exit or another value for continue ! ");

            int type = scan.nextInt();

            if (type == 1) {
                System.out.println("Exit success!");
                break;
            }
        }

    }
}
