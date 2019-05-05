package com.ioay.javasamples.samples;

import java.util.Scanner;

public class CalculateGradesSample {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String courses[] = new String[2]; //define courses count

        int grades[] = new int[2]; //define courses grades count

        for (int i = 0; i < courses.length; i++) {

            System.out.println((i + 1) + ") Please enter your course name : ");
            String courseName = scan.next();
            courses[i] = courseName;

            System.out.println((i + 1) + ") Please enter your course grade : ");
            int grade = scan.nextInt();
            grades[i] = grade;

        }

        int total = 0;

        for (int j = 0; j < grades.length; j++) {
            System.out.println(courses[j] + " : " + grades[j]);
            total = total + grades[j];
        }

        total = total / courses.length;

        System.out.println("Total Average : " + total);

        if (total >= 70) {
            System.out.println("You are very successful !");
        } else {
            System.out.println("You should study a lot !! ");
        }
    }
}
