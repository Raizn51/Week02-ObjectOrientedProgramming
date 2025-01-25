package com.tit.day05javainheritance.assistedproblems.vehicletransportsystem;

// Creating a class Car to represent specific Car objects inheriting from Vehicle (Subclass)
class Car extends Vehicle {
    // Unique attribute for Car
    private int seatCapacity;

    // Constructor to initialize Car objects with provided values
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Calling the superclass constructor
        this.seatCapacity = seatCapacity;
    }

    // Overriding the displayInfo() method to include seat capacity information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
