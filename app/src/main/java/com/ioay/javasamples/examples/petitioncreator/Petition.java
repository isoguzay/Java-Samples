package com.ioay.javasamples.examples.petitioncreator;

public class Petition {

    String studentName;
    int studentNumber;
    int excuseDay;
    String date;
    String studentParent;
    String studentSchoolName;

    public String createPetition(String studentName, String studentParent, String date, String studentSchoolName, int studentNumber, int excuseDay) {

        String petition = "\t\t To Dear, " + studentSchoolName + " \nStudent name is "
                + studentName + " and school number is " + studentNumber + "\nI want to excuse " + excuseDay + " days."
                + "I am with my family, " + studentParent + "\n\nStudent Name : " + studentName + "\n\nDate: " + date;

        return petition;
    }
}
