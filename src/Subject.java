
/* Name: subject.java
Date: 14 January 2025
Author: Dim Ponhakvontey
Modified: 14 January 2025
Description: Lab 05
Functions:
 -getPrice(): Double
 -getProgram(): String
 -getName(): String
 -getCredits(): int
 Variables:
 -price: Double
 -PROGRAM: String
 -name: String
 -credits: int */
package week5.lab05;
public class subject {

    private static final double price;
    static {
        price = 9.9;
    }
    public static final double getPrice() {
        return price;
    }
    private static final String PROGRAM = "Year 2 Program";

    private String name;
    private int credits;

    

    public static String getProgram() {
        return PROGRAM;
    }

    public subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        subject s = new subject("Java Programming", 5);
        System.out.println("Subject: " + s.getName());
        System.out.println("Credits: " + s.getCredits());
        System.out.println("Program: " + subject.getProgram());
        System.out.println("Price: " + subject.getPrice());
        

    }

}