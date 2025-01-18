/*
Write a Circle class with a radius attribute. Use constructor 
chaining to initialize radius with default and user-provided values.
*/

import java.util.Scanner;

// Creating a Class Circle to store circle radius and calculate area and circumference
class Circle {
    // Declaring private attribute for the radius of the circle
    private double radius;

    // Default constructor to initialize the radius to a default value
    public Circle() {
        this(1.0); // Constructor chaining: calls the parameterized constructor with default value
    }

    // Parameterized constructor to initialize the radius with a user-provided value
    public Circle(double radius) {
        // Initializing radius with the given value
        this.radius = radius;
    }

    // Getter method for the radius attribute
    public double getRadius() {
        return radius;
    }

    // Setter method for the radius attribute
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        // Using the formula: Area = π * radius^2
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        // Using the formula: Circumference = 2 * π * radius
        return 2 * Math.PI * radius;
    }
}

// Creating a Class CircleTesting to demonstrate the functionalities of the Circle class
public class CircleTesting {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Creating a Circle object using the default constructor
        Circle defaultCircle = new Circle();
        // Displaying details of the default circle
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
        System.out.println("Default Circle Circumference: " + defaultCircle.calculateCircumference());

        // Creating a Circle object using the parameterized constructor with a specified value
        Circle customCircle1 = new Circle(5.0);
        // Displaying details of the custom circle with specified radius
        System.out.println("Custom Circle Radius: " + customCircle1.getRadius());
        System.out.println("Custom Circle Area: " + customCircle1.calculateArea());
        System.out.println("Custom Circle Circumference: " + customCircle1.calculateCircumference());

        // Prompting the user to enter the radius for a custom circle 
        System.out.print("Enter the radius of the circle:"); 
        double userRadius = scanner.nextDouble(); 
        
        // Creating a Circle object using the parameterized constructor with user-provided radius 
        Circle customCircle2 = new Circle(userRadius);
        // Displaying details of the custom circle with user-provided radius
        System.out.println("User's Custom Circle Radius: " + customCircle2.getRadius());
        System.out.println("User's Custom Circle Area: " + customCircle2.calculateArea());
        System.out.println("User's Custom Circle Circumference: " + customCircle2.calculateCircumference()); 

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
