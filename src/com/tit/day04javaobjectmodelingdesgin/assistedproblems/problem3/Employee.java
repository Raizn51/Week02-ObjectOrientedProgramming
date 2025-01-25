package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem3;

// Creating an Employee class to represent individual employees
class Employee
{
    // Declaring attributes for the Employee class
    private String name;
    private int id;

    // Constructor to initialize Employee objects with provided values
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    public void display()
    {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
