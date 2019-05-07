package com.ioay.javasamples.objectorientedprogramming;

public class ReferancesTypeMain {

    public static void main(String args[]) {

        int num1 = 40;

        int num2 = num1;

        num1 = 50;

        System.out.println(num1 + " " + num2);

        Student student = new Student();

        student.studentName = "isoguzay";

        System.out.println(student.studentName);

        Student student2 = student;

        System.out.println(student2.studentAddress);

        System.out.println(student2.studentName);

        student2.studentName = "oguzay";

        System.out.println(student.studentName);

        System.out.println(student.hashCode()); // Memory Location
        System.out.println(student2.hashCode()); // Memory Location

    }
}
