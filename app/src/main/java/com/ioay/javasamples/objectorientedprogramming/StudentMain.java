package com.ioay.javasamples.objectorientedprogramming;

public class StudentMain {

    public static void main(String args[]) {

        Student student = new Student();

        student.studentName = "isoguzay";
        student.studentNumber = 34;
        student.studentAddress = "Istanbul";

        System.out.println(student.studentName);

        Student student2 = new Student("isoguzay", 50, "Izmir");

        System.out.println(student2.studentName + "\n" + student2.studentAddress);
    }
}
