package com.ioay.javasamples.examples.equalsandstringsample.main;

import com.ioay.javasamples.examples.equalsandstringsample.model.Student;

public class EqualsStringMain {

    public static void main(String args[]) {

        Student student = new Student(1,"iso");
        Student student1 = new Student(2,"oguz");
        Student student2 = new Student(3,"isoguz");
        Student student3 = new Student(4,"isoguzay");

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        if (student.equals(student2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal ! ");
        }
    }
}