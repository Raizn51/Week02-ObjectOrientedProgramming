package com.tit.day05javainheritance.hybridinheritance.restaurantmanagementsystem;

class Person {
    // Declaring protected attributes for the Person class
    protected String name;
    protected int id;

    // Constructor to initialize Person objects with provided values
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.printf("Name: %s, ID: %d%n", name, id);
    }
}