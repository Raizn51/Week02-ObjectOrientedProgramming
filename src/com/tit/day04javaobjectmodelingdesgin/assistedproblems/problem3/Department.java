package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem3;

import java.util.ArrayList;

// Creating a Department class to represent different departments within the company
class Department
{
    // Declaring attributes for the Department class
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor to initialize Department objects with provided name
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // Initializing the ArrayList of employees
    }

    // Method to add an employee to the department
    public void addEmployee(String name, int id)
    {
        employees.add(new Employee(name, id));
    }

    public String getDepartmentName() {
        return departmentName;
    }
    // Method to display all employees in the department
    public void display()
    {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees)
        {
            employee.display();
        }
    }
}