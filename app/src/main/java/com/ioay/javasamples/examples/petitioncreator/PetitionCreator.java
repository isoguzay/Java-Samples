package com.ioay.javasamples.examples.petitioncreator;

import java.util.Scanner;

public class PetitionCreator {

    public static void main(String args[]) {

        Petition petition = new Petition();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your information for create a petition : ");

        System.out.println("Student name : ");
        petition.studentName = scan.next();
        System.out.println("Student number : ");
        petition.studentNumber = scan.nextInt();
        System.out.println("Student parent name : ");
        petition.studentParent = scan.next();
        System.out.println("Date : ");
        petition.date = scan.next();
        System.out.println("Excuse days : ");
        petition.excuseDay = scan.nextInt();
        System.out.println("Student school name : ");
        petition.studentSchoolName = scan.next();

        String result = petition.createPetition(petition.studentName,petition.studentParent,petition.date,petition.studentSchoolName,petition.studentNumber,petition.excuseDay);

        System.out.println(result);
    }
}
