package com.tit.day05javainheritance.hybridinheritance.restaurantmanagementsystem;

/*
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

// Creating a class RestaurantManagementSystem to demonstrate the functionalities of the Person and its subclasses
class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Chef chef1 = new Chef("Alice", 101);
        Chef chef2 = new Chef("John", 103);
        Waiter waiter1 = new Waiter("Bob", 102);
        Waiter waiter2 = new Waiter("Emily", 104);

        // Displaying details and performing duties for each Chef
        chef1.displayDetails();
        chef1.performDuties();
        System.out.println();

        chef2.displayDetails();
        chef2.performDuties();
        System.out.println();

        // Displaying details and performing duties for each Waiter
        waiter1.displayDetails();
        waiter1.performDuties();
        System.out.println();

        waiter2.displayDetails();
        waiter2.performDuties();
    }
}