package com.tit.day05javainheritance.assistedproblems.employeemanagementsystem;

// Creating a class Intern to represent specific Intern objects inheriting from Employee (Subclass)
class Intern extends Employee {
    // Unique attribute for Intern
    private String mentorName;

    // Constructor to initialize Intern objects with provided values
    public Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary); // Calling the superclass constructor
        this.mentorName = mentorName;
    }

    // Overriding the displayDetails() method to include mentor name information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.println("Mentor Name: " + mentorName);
    }
}
