package com.tit.day05javainheritance.assistedproblems.vehicletransportsystem;

/*

Problem 3: Vehicle and Transport System (Inheritance and Polymorphism)
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
*/

// Creating a class VehicleTransportSystem to demonstrate the functionalities of the Vehicle and its subclasses
class VehicleTransportSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10000);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Storing objects of different subclasses in an array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Demonstrating polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
