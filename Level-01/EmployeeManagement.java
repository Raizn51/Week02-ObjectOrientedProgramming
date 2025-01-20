/*
Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
*/

// Creating a class Employee to manage employee details and functionalities
class Employee 
{
    // Static variable to store the company name shared by all employees
    private static String companyName = "Gourav Innovators";

    // Static variable to keep track of the total number of employees
    private static int totalEmployees = 0;

    // Declaring private attributes for the Employee class
    private String name;
    private final int id; // Final variable to ensure the employee ID cannot be changed
    private String designation;

    // Constructor to initialize employee details with provided values
    public Employee(String name, int id, String designation) 
	{
        // Using 'this' keyword to resolve ambiguity
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Incrementing the total number of employees
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() 
	{
        System.out.println("Total number of employees: " + totalEmployees);
		System.out.println();
    } 
	// Static method to display the total number of employees
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
		System.out.println();
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the id attribute
    public int getId() {
        return id;
    }

    // Getter method for the designation attribute
    public String getDesignation() {
        return designation;
    }

    // Setter method for the designation attribute
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() 
	{
        // Checking if the employee object is an instance of the Employee class
        if (this instanceof Employee) 
		{
            System.out.printf("Name: %s, ID: %d, Designation: %s%n", this.name, this.id, this.designation);
        } 
		else 
		{
            System.out.println("Invalid employee object.");
        }
		System.out.println();
    }
}

// Creating a class EmployeeManagement to demonstrate the functionalities of the Employee class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects using the constructor
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");

        // Displaying employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
		
        // Displaying the company anme and total number of employees
        Employee.displayCompanyName();
		Employee.displayTotalEmployees();
    }
}
