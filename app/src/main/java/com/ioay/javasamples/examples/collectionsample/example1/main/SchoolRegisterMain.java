package com.ioay.javasamples.examples.collectionsample.example1.main;

import com.ioay.javasamples.examples.collectionsample.example1.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolRegisterMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        while (true) {

            System.out.println("Enter Student Number :");
            int number = scanner.nextInt();

            System.out.println("Enter Student Name: ");
            String name = scanner.next();

            Student student = new Student(number, name);

            studentArrayList.add(student);

            System.out.println("Enter 1 for Exit - Other Numbers Continue");

            int choose = scanner.nextInt();

            if (choose == 1) {
                for (Student s : studentArrayList) {
                    System.out.println("\n - - - - - - - -");
                    System.out.println("Student Number : " + s.getStudentNumber());
                    System.out.println("Student Name : " + s.getStudentName());
                }
                break;
            }
        }
    }
}
