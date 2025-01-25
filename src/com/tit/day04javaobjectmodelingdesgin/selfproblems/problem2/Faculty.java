package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem2;

// Creating a Faculty class to represent faculty members
class Faculty {
    // Declaring attributes for the Faculty class
    private String name;
    private String specialization;

    // Constructor to initialize Faculty objects with provided values
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Getter method for the faculty name
    public String getName() {
        return name;
    }

    // Getter method for the faculty specialization
    public String getSpecialization() {
        return specialization;
    }

    // Method to display faculty details
    public void display() {
        System.out.println("Faculty: " + name + ", Specialization: " + specialization);
    }
}