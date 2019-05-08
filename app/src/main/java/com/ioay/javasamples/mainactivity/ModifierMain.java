package com.ioay.javasamples.mainactivity;

import com.ioay.javasamples.modifiers.Employee;
import com.ioay.javasamples.modifiers.Product;

public class ModifierMain {

    public static void main(String args[]){

        Employee employee = new Employee();

        // employee.employeeName = "isoguzay";
        employee.setEmployeeName("isoguzay");

        employee.employeeDepartment = "IT";

        // employee.employeeNo = 34;
        employee.setEmployeeNo(34);

        System.out.println("Employee name with get method : " + employee.getEmployeeName());

        employee.getInfo();

        Product product = new Product("Laptop", 1,5);

        String productInfo = product.toString();

        System.out.println(productInfo);

    }
}
