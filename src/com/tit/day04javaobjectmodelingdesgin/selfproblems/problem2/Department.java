package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem2;

import java.util.ArrayList;

// Creating a Department class to represent departments within the university
class Department {
    // Declaring attributes for the Department class
    private String departmentName;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize Department objects with provided name
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>(); // Initializing the ArrayList of faculties
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    // Method to display all faculty members in the department
    public void display() {
        System.out.println("Department: " + departmentName);
        if (faculties.isEmpty()) {
            System.out.println("  No faculty members in this department.");
        } else {
            System.out.println("  Faculties:");
            for (Faculty faculty : faculties) {
                System.out.println("    - " + faculty.getName() + " (" + faculty.getSpecialization() + ")");
            }
        }
    }
}