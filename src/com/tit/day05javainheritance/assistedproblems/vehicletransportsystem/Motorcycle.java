package com.tit.day05javainheritance.assistedproblems.vehicletransportsystem;

// Creating a class Motorcycle to represent specific Motorcycle objects inheriting from Vehicle (Subclass)
class Motorcycle extends Vehicle {
    // Unique attribute for Motorcycle
    private boolean hasSidecar;

    // Constructor to initialize Motorcycle objects with provided values
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Calling the superclass constructor
        this.hasSidecar = hasSidecar;
    }

    // Overriding the displayInfo() method to include sidecar information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
