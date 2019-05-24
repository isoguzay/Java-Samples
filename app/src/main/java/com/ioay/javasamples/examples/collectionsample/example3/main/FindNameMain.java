package com.ioay.javasamples.examples.collectionsample.example3.main;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNameMain {

    public static void main(String args[]) {

        ArrayList<String> namelist = new ArrayList<>();

        namelist.add("Dany");
        namelist.add("John");
        namelist.add("Arya");
        namelist.add("Tyrion");
        namelist.add("Jamie");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a name for checking name : ");

        String checkName = scan.next();

        for (String s : namelist) {
            if (checkName.equalsIgnoreCase(s)) {
                System.out.println("Thats right ! You found name :) ");
                break;
            }
        }
    }
}
