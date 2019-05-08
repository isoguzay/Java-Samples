package com.ioay.javasamples.modifiers;

public class Personal {

    String personalName;
    private int personalId;
    private int personalAge;
    public int personalPassword;
    public static String personalUsername;
    public static int counter;

    public Personal(String personalName, int personalId, int personalAge) {
        this.personalName = personalName;
        this.personalId = personalId;
        this.personalAge = personalAge;
        counter++;
    }

    public Personal(String personalName, int personalId) {
        this.personalName = personalName;
        this.personalId = personalId;
    }

    public Personal() {
        counter++;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public int getPersonalAge() {
        return personalAge;
    }

    public void setPersonalAge(int personelAge) {
        this.personalAge = personelAge;
    }
}
