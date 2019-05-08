package com.ioay.javasamples.modifiers;

public class Employee {

    String employeeName; // default access modifier -> protected
    public String employeeDepartment; // public
    private int employeeNo; // private

    /*
    * Example of Encapsulation
    * */
    public void setEmployeeNo(int employeeNo){
        this.employeeNo = employeeNo;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public int getEmployeeNo(){
        return this.employeeNo;
    }

    public void getInfo() {
        System.out.println("Employee name : " + employeeName
                + "\nEmployee department : " + employeeDepartment
                + "\nEmployee number : " + employeeNo);
    }

}
