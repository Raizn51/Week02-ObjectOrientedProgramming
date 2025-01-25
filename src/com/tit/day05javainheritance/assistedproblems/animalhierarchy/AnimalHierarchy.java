package com.tit.day05javainheritance.assistedproblems.animalhierarchy;

/*
Problem 1: Animal Hierarchy (Inheritance)
Description: Create an Animal superclass with subclasses Dog, Cat, and Bird. Model the relationship such that different types
of animals inherit from the Animal class and override methods as needed.
Tasks:
Define an Animal class with attributes such as name and age, and methods like makeSound() and displayDetails().
Define subclasses Dog, Cat, and Bird that extend the Animal class and override the makeSound() method.
Demonstrate the inheritance relationship by creating instances of each subclass and invoking their methods.
Goal: Understand inheritance by modeling a real-world relationship where different types of animals inherit from a common superclass.
*/

// Creating a class AnimalHierarchy to demonstrate the functionalities of the Animal and its subclasses
class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Displaying details and making sounds for each animal
        dog.displayDetails();
        dog.makeSound();

        cat.displayDetails();
        cat.makeSound();

        bird.displayDetails();
        bird.makeSound();
    }
}
