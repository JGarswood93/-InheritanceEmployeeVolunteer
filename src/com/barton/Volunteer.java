package com.barton;

public class Volunteer extends Employee {//using the stuff from the extended class


    public Volunteer(String name, int hours) {
        super(name, hours);//super is used as a reference variable
    }

    void setHours(int hours){
        this.hours = hours;
    }
    int getHours(){
        return hours;
    }
    @Override
    void print() {
        System.out.println("\n" + "Volunteer Name: " + this.getName()
                + "\nHours: " + this.getHours());
    }
    /**
     * A setter is a method that updates the value of a variable and a getter is a method that reads the value of the variable
     */
}
