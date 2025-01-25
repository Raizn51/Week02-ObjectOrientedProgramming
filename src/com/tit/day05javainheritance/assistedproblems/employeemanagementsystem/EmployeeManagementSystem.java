package com.tit.day05javainheritance.assistedproblems.employeemanagementsystem;

/*
Problem 2: Employee Management System (Inheritance)
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/

// Creating a class EmployeeManagementSystem to demonstrate the functionalities of the Employee and its subclasses
class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Employee manager = new Manager("Alice", 101, 95000, 10);
        Employee developer = new Developer("Bob", 102, 80000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, "Eve");

        // Displaying details for each employee
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
