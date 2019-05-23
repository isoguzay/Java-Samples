package com.ioay.javasamples.collections.list.arraylist.main;

import com.ioay.javasamples.collections.list.arraylist.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListObjectMain {

    public static void main(String args[]){

        List<Student> studentArrayList = new ArrayList<>();

        Student student = new Student(55,"n-iso");
        Student student1 = new Student(25, "a-oguz");
        Student student2 = new Student(37, "z-isoguz");
        Student student3 = new Student(14, "t-isoguzay");

        studentArrayList.add(student);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        Collections.sort(studentArrayList);

        for(Student s : studentArrayList){
            System.out.println("--------");
            System.out.println("Student Name : " + s.getName());
            System.out.println("Student Id : " + s.getId()+"\n");
        }

    }
}
