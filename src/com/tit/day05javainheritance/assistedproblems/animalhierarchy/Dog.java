package com.tit.day05javainheritance.assistedproblems.animalhierarchy;

// Creating a class Dog to represent specific Dog objects inheriting from Animal (Subclass)
class Dog extends Animal {

    // Constructor to initialize Dog objects with provided values
    public Dog(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to specify the sound a dog makes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
