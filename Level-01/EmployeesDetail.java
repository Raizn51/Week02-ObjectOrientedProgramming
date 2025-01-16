/*
Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with
attributes name, id, and salary. Add a method to display the details.
 */
import java.util.Scanner; // Importing the Scanner class to read user input

// This class represents an employee with a name, ID, and salary
class Employee 
{
    // Private attributes for name, ID, and salary
    private String name; // Attribute to store the name of the employee
    private String id; // Attribute to store the ID of the employee
    private double salary; // Attribute to store the salary of the employee

    // Constructor to initialize the Employee object with name, ID, and salary
    public Employee(String name, String id, double salary) 
	{
        this.name = name; // Assigning the name to the employee
        this.id = id; // Assigning the ID to the employee
        this.salary = salary; // Assigning the salary to the employee
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name); // Printing the name of the employee
        System.out.println("ID: " + id); // Printing the ID of the employee
        System.out.println("Salary: " + salary); // Printing the salary of the employee
    }
}

// This class contains the main method to create and display employee details
class EmployeesDetail 
{
    public static void main(String [] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the details for the first employee
        System.out.print("Enter the name of employee 1: "); // Prompt for employee 1 name
        String name1 = scanner.nextLine(); // Reading the name of employee 1
        System.out.print("Enter the ID of employee 1: "); // Prompt for employee 1 ID
        String id1 = scanner.nextLine(); // Reading the ID of employee 1
        System.out.print("Enter the salary of employee 1: "); // Prompt for employee 1 salary
        double salary1 = scanner.nextDouble(); // Reading the salary of employee 1

        // Prompting the user to enter the details for the second employee
        scanner.nextLine(); // Consuming the newline character left over
        System.out.print("Enter the name of employee 2: "); // Prompt for employee 2 name
        String name2 = scanner.nextLine(); // Reading the name of employee 2
        System.out.print("Enter the ID of employee 2: "); // Prompt for employee 2 ID
        String id2 = scanner.nextLine(); // Reading the ID of employee 2
        System.out.print("Enter the salary of employee 2: "); // Prompt for employee 2 salary
        double salary2 = scanner.nextDouble(); // Reading the salary of employee 2

        // Creating Employee objects with the provided details
        Employee employee1 = new Employee(name1, id1, salary1); // Creating an object for employee 1
        Employee employee2 = new Employee(name2, id2, salary2); // Creating an object for employee 2

        // Displaying the details of each employee
        System.out.println("\n=== Employee 1 ==="); // Header for employee 1 details
        employee1.displayDetails(); // Calling method to display details of employee 1
        System.out.println("\n=== Employee 2 ==="); // Header for employee 2 details
        employee2.displayDetails(); // Calling method to display details of employee 2

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
