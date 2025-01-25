package com.tit.day05javainheritance.hybridinheritance.VehicleManagementSystem;

/*
Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle includes a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
*/

// Creating a class VehicleManagementSystem to demonstrate the functionalities of the Vehicle and its subclasses
class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        ElectricVehicle electricVehicle1 = new ElectricVehicle(150, "Tesla Model S");
        ElectricVehicle electricVehicle2 = new ElectricVehicle(140, "Nissan Leaf");
        PetrolVehicle petrolVehicle1 = new PetrolVehicle(180, "Ford Mustang");
        PetrolVehicle petrolVehicle2 = new PetrolVehicle(160, "Chevrolet Camaro");

        // Displaying vehicle details and demonstrating unique behaviors for each ElectricVehicle
        electricVehicle1.displayDetails();
        electricVehicle1.charge();
        System.out.println();

        electricVehicle2.displayDetails();
        electricVehicle2.charge();
        System.out.println();

        // Displaying vehicle details and demonstrating unique behaviors for each PetrolVehicle
        petrolVehicle1.displayDetails();
        petrolVehicle1.refuel();
        System.out.println();

        petrolVehicle2.displayDetails();
        petrolVehicle2.refuel();
    }
}