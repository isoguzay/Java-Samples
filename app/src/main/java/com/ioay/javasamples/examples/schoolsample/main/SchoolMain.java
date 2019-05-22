package com.ioay.javasamples.examples.schoolsample.main;

import com.ioay.javasamples.examples.schoolsample.model.Employee;
import com.ioay.javasamples.examples.schoolsample.model.Manager;
import com.ioay.javasamples.examples.schoolsample.model.Teacher;

public class SchoolMain {

    public static void main(String args[]) {

        Manager manager = new Manager();

        Teacher teacher = new Teacher();

        Employee employee = new Employee();

        manager.getJob(teacher);

        manager.getJob(employee);

        manager.bePromoted(teacher);

        manager.bePromoted(employee);

    }
}
