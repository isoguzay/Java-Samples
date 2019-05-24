package com.ioay.javasamples.examples.collectionsample.example5.main;

import com.ioay.javasamples.examples.collectionsample.example5.model.Address;
import com.ioay.javasamples.examples.collectionsample.example5.model.Personal;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalListMain {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        ArrayList<Personal> personalArrayList = new ArrayList<>();

        for(int i=0; i<2; i++){
            System.out.println((i+1)+". Personal Name : ");
            String personalName = scan.next();

            System.out.println((i+1) + ". Personal Address City : ");
            String personalCity = scan.next();

            System.out.println((i+1) + ". Personal Address County : ");
            String personalCounty = scan.next();

            /*
            * usage of Composition with Java
            * */

            Address personalAdress = new Address(personalCity,personalCounty);

            Personal personal = new Personal((i+1),personalName,personalAdress);

            personalArrayList.add(personal);

        }

        for (Personal p : personalArrayList){
            System.out.println("\n ----- Personal Info ---- ");
            System.out.println("Personal No : " + p.getPersonalNo());
            System.out.println("Personal Name : " + p.getPersonalName());
            System.out.println("----- Address ----- ");
            System.out.println("Personal City : " + p.getPersonalAddress().getCity());
            System.out.println("Personal County : " + p.getPersonalAddress().getCounty());

        }
    }
}
