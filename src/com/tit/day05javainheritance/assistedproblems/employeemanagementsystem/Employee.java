package com.tit.day05javainheritance.assistedproblems.employeemanagementsystem;

// Creating a base class Employee to represent generic employee attributes (Superclass)
class Employee {
    // Declaring protected attributes for the Employee class
    protected String name;
    protected int id;
    protected double salary;

    // Constructor to initialize Employee objects with provided values
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details, to be overridden in subclasses if needed
    public void displayDetails() {
        System.out.printf("Name: %s, ID: %d, Salary: %.2f%n", name, id, salary);
    }
}
