package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;


// Creating an abstract class Employee to represent generic employees (Superclass)
abstract class Employee {
    // Declaring private attributes for the Employee class
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize Employee objects with provided values
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to be implemented in subclasses to calculate salary
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    // Getter and setter methods for encapsulation
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
