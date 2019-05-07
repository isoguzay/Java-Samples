package com.ioay.javasamples.objectorientedprogramming;

public class Student {

    String studentName;
    int studentNumber;
    String studentAddress; // Global Variables

    /*Constructor*/
    public Student() {

    }

    public Student(String studentName, int studentNumber, String studentAddress) { // Local Variables
        this.studentAddress = studentAddress;
        this.studentNumber = studentNumber;
        this.studentName = studentName; // Using "this", shadowing
    }
}
