package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem2;

import java.util.ArrayList;

// Creating a University class to manage departments and faculties
class University {
    // Declaring attributes for the University class
    private String universityName;
    private ArrayList<Department> departments;

    // Constructor to initialize the University object with provided name
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>(); // Initializing the ArrayList of departments
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        if (!departments.contains(department)) {
            departments.add(department);
        }
    }

    // Method to display all departments and their faculties in the university
    public void display() {
        System.out.println("University: " + universityName);
        if (departments.isEmpty()) {
            System.out.println("  No departments in this university.");
        } else {
            for (Department department : departments) {
                department.display();
            }
        }
    }

    // Method to delete the university and its departments
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); // All departments are deleted as part of composition
    }
}