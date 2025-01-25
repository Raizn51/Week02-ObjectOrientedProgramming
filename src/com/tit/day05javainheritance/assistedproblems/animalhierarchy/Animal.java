package com.tit.day05javainheritance.assistedproblems.animalhierarchy;

// Creating a class Animal to represent generic animals (Superclass)
class Animal {
    // Declaring protected attributes for the Animal class
    protected String name;
    protected int age;

    // Constructor to initialize Animal objects with provided values
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden in subclasses to specify the sound an animal makes
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}