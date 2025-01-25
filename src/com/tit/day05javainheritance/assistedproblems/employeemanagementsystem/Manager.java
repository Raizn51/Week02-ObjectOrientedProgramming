package com.tit.day05javainheritance.assistedproblems.employeemanagementsystem;

// Creating a class Manager to represent specific Manager objects inheriting from Employee (Subclass)
class Manager extends Employee {
    // Unique attribute for Manager
    private int teamSize;

    // Constructor to initialize Manager objects with provided values
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Calling the superclass constructor
        this.teamSize = teamSize;
    }

    // Overriding the displayDetails() method to include team size information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.println("Team Size: " + teamSize);
    }
}
