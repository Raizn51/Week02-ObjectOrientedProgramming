package com.tit.day05javainheritance.assistedproblems.vehicletransportsystem;

// Creating a class Truck to represent specific Truck objects inheriting from Vehicle (Subclass)
class Truck extends Vehicle {
    // Unique attribute for Truck
    private int loadCapacity;

    // Constructor to initialize Truck objects with provided values
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType); // Calling the superclass constructor
        this.loadCapacity = loadCapacity;
    }

    // Overriding the displayInfo() method to include load capacity information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

