package com.tit.day05javainheritance.assistedproblems.employeemanagementsystem;

// Creating a class Developer to represent specific Developer objects inheriting from Employee (Subclass)
class Developer extends Employee {
    // Unique attribute for Developer
    private String programmingLanguage;

    // Constructor to initialize Developer objects with provided values
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Calling the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails() method to include programming language information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}