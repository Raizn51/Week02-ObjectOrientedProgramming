/*
Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius.
Add methods to calculate and display the area and circumference of the circle.
*/

// This class represents a circle with a given radius and methods to calculate its area and circumference
import java.util.Scanner;
class Circle
{
    // Attribute to store the radius of the circle
    private double radius;

    // Constructor to initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius; // Assigning the radius to the circle
    }

    // Method to calculate the area of the circle
    public double calculateArea()
    {
        return Math.PI * radius * radius; // Formula to calculate the area: πr²
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference()
    {
        return 2 * Math.PI * radius; // Formula to calculate the circumference: 2πr
    }

    // Method to display the area and circumference of the circle
    public void displayDetails()
    {
        System.out.println("Radius: " + radius); // Printing the radius of the circle
        System.out.println("Area: " + calculateArea()); // Printing the area of the circle
        System.out.println("Circumference: " + calculateCircumference()); // Printing the circumference of the circle
    }
}

// This class contains the main method to create and display circle details
class AreaOfACircle
{
    public static void main(String[] args)
    {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: "); // Prompt for radius
        double radius = scanner.nextDouble(); // Reading the radius from the user

        // Creating a Circle object with the provided radius
        Circle circle = new Circle(radius); // Creating an object for the circle

        // Displaying the details of the circle (radius, area, and circumference)
        circle.displayDetails(); // Calling method to display details of the circle

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
