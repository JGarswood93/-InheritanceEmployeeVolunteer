package com.barton;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Added hours to the employee my self
 * Point of this script is to have the payment details for employee missing
 * Whilst having all the other details remaining
 */
public class Employee {
    /**
     * Primitive data types
     * Access Modifiers: Protected this is when a method o a variable is marked as protected
     * it can be accessed from with in the class it is in, other classes in the same package and sub classes
     * int other packages
     */
    protected String name;
    private int salary;
    int hours;

    //Constructor of employee class (this is why classes are like blueprints)
    Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    //getters and setters are used for retrieving and updating different kinds of data
    String getName() {
        return name;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    //Only to be used in this class, This is the condition for the employee
    //Assuming there is no salary
    void print() {
        if (this.salary == 0) {
            System.err.println("Employee Name: " + this.name + "; please set salary and try again. \n");
            //only to print in the event of an error
        } else {
            /**
             * Simply used to format numbers in accordance to how it is formatted in England
             *
             * It can be used for currencies
             */

            NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.UK);

            System.out.println("Employee Name: " + this.name + "\nSalary: " + salaryFormat.format(this.salary) + "\n" + "Hours: " + this.hours);
        }
    }

    /**
     * Main methos for things to be printed to console
     *
     * @param args Calling data from constructors as objects then using the names of the variables in functions
     *             to print out as a method
     */
    public static void main(String[] args) {
        Employee emp = new Employee("Sam", 12);
        emp.print();
        emp.setSalary(60000);
        emp.print();
        Volunteer vol = new Volunteer("Oscar", 20);
        vol.print();
    }
}
