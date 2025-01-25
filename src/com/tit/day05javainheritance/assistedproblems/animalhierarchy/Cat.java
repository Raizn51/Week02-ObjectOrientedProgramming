package com.tit.day05javainheritance.assistedproblems.animalhierarchy;

// Creating a class Cat to represent specific Cat objects inheriting from Animal (Subclass)
class Cat extends Animal {

    // Constructor to initialize Cat objects with provided values
    public Cat(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to specify the sound a cat makes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
