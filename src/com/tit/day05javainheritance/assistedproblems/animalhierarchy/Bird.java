package com.tit.day05javainheritance.assistedproblems.animalhierarchy;

// Creating a class Bird to represent specific Bird objects inheriting from Animal (Subclass)
class Bird extends Animal {

    // Constructor to initialize Bird objects with provided values
    public Bird(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to specify the sound a bird makes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}