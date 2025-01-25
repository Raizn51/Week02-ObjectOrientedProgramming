package com.tit.javaencapsulationpolymorphismabstraction.vehiclerentalsystem;

/*

Problem 3: Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of vehicles inherit from a common superclass and override methods as needed.
*/
import java.util.ArrayList;
import java.util.List;

// Creating a class VehicleRentalSystem to demonstrate the functionalities of the Vehicle and its subclasses
class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating a list to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Creating objects for each vehicle type and adding them to the list
        vehicles.add(new Car("C001", "Car", 500));
        vehicles.add(new Bike("B001", "Bike", 200));
        vehicles.add(new Truck("T001", "Truck", 1000));
        vehicles.add(new Car("C002", "Car", 550));
        vehicles.add(new Bike("B002", "Bike", 220));
        vehicles.add(new Truck("T002", "Truck", 1100));

        // Processing and displaying details of each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(5); // Assuming rental for 5 days
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();
            double finalCost = rentalCost + insuranceCost;
            System.out.println("Rental Cost for 5 days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Final Cost: " + finalCost);
            System.out.println();
        }
    }
}
