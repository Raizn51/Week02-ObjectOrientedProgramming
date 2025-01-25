package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem3;

import java.util.ArrayList;

// Creating a Company class to manage departments and employees
class Company {
    // Declaring attributes for the Company class
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor to initialize the Company object with provided name
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>(); // Initializing the ArrayList of departments
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to retrieve a department by name
    public Department getDepartment(String departmentName)
    {
        for (Department department : departments) {
            if (departmentName.equals(department.getDepartmentName())) {
                return department;
            }
        }
        return null; // Department not found
    }

    // Method to display all departments and their employees in the company
    public void display() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.display();
        }
    }

    // Override the finalize method to display a message when the Company object is deleted
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Company " + companyName + " is being deleted, along with its departments and employees.");
        super.finalize();
    }
}
