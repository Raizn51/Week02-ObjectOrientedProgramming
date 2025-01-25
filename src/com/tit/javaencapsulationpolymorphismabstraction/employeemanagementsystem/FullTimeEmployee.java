package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;

// Creating a class FullTimeEmployee to represent specific full-time employees inheriting from Employee (Subclass)
class FullTimeEmployee extends Employee {

    // Constructor to initialize FullTimeEmployee objects with provided values
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary); // Calling the superclass constructor
    }

    // Implementing the calculateSalary() method for full-time employees
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}
