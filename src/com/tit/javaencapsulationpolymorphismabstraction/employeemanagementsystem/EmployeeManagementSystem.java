package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;

/*

Problem 1: Employee Management System (Inheritance, Polymorphism)
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of employees inherit from a common superclass and override methods as needed.
*/
import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate the functionalities of Employee and its subclasses
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list to store employee objects
        List<Employee> employees = new ArrayList<>();

        // Create FullTimeEmployee and PartTimeEmployee objects with provided values
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(101, "Alice", 50000);
        fullTimeEmployee1.assignDepartment("Finance");
        employees.add(fullTimeEmployee1);

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(102, "Bob", 200, 25);
        partTimeEmployee1.assignDepartment("Support");
        employees.add(partTimeEmployee1);

        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee(103, "Charlie", 52000);
        fullTimeEmployee2.assignDepartment("HR");
        employees.add(fullTimeEmployee2);

        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee(104, "David", 210, 20);
        partTimeEmployee2.assignDepartment("IT");
        employees.add(partTimeEmployee2);

        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee(105, "Eve", 53000);
        fullTimeEmployee3.assignDepartment("Marketing");
        employees.add(fullTimeEmployee3);

        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee(106, "Fay", 220, 15);
        partTimeEmployee3.assignDepartment("Logistics");
        employees.add(partTimeEmployee3);

        FullTimeEmployee fullTimeEmployee4 = new FullTimeEmployee(107, "Grace", 54000);
        fullTimeEmployee4.assignDepartment("Sales");
        employees.add(fullTimeEmployee4);

        PartTimeEmployee partTimeEmployee4 = new PartTimeEmployee(108, "Heidi", 230, 10);
        partTimeEmployee4.assignDepartment("Customer Service");
        employees.add(partTimeEmployee4);

        FullTimeEmployee fullTimeEmployee5 = new FullTimeEmployee(109, "Ivan", 55000);
        fullTimeEmployee5.assignDepartment("Legal");
        employees.add(fullTimeEmployee5);

        PartTimeEmployee partTimeEmployee5 = new PartTimeEmployee(110, "Judy", 240, 30);
        partTimeEmployee5.assignDepartment("Research");
        employees.add(partTimeEmployee5);

        // Process and display details of each employee using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails(); // Display details of each employee
            if (employee instanceof Department) { // Check if the employee implements Department
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("--------------------------------");
        }
    }
}
