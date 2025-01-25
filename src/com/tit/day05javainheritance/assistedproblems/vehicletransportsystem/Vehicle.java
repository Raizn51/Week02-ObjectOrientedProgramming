package com.tit.day05javainheritance.assistedproblems.vehicletransportsystem;

// Creating a class Vehicle to represent generic vehicles (Superclass)
class Vehicle {
    // Declaring protected attributes for the Vehicle class
    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize Vehicle objects with provided values
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information, to be overridden in subclasses if needed
    public void displayInfo() {
        System.out.printf("Max Speed: %d km/h, Fuel Type: %s%n", maxSpeed, fuelType);
    }
}