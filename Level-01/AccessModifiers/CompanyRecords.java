/*
Problem 4: Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
*/

// Creating a Class Employee to manage employee details
class Employee 
{
    // Declaring public instance variable for employee ID
    public int employeeID;
    
    // Declaring protected instance variable for department
    protected String department;
    
    // Declaring private instance variable for salary
    private double salary;

    // Parameterized constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID; // Initializing employee ID
        this.department = department; // Initializing department
        this.salary = salary;         // Initializing salary
    }

    // Public method to modify the salary
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.printf("Employee ID: %d, Department: %s, Salary: %.2f%n", this.employeeID, this.department, this.salary);
    }
}

// Creating a subclass Manager to demonstrate access to employee ID and department
class Manager extends Employee 
{
    // Declaring additional attribute for Manager
    private String teamName;

    // Parameterized constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String teamName) {
        // Calling the superclass constructor to initialize inherited attributes
        super(employeeID, department, salary);
        this.teamName = teamName; // Initializing team name
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Displaying base class details
        System.out.printf("Team Name: %s%n", this.teamName);
    }
}

// Creating a class CompanyRecords to demonstrate functionalities of Employee and Manager classes
class CompanyRecords 
{
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Employee employee1 = new Employee(101, "IT", 50000.0);
        
        // Creating a Manager object using the parameterized constructor
        Manager manager1 = new Manager(201, "HR", 60000.0, "Team Alpha");

        // Displaying details of the employee
        System.out.println("Employee Details:");
        employee1.displayEmployeeDetails();

        // Modifying and displaying the updated salary of the employee
        employee1.modifySalary(55000.0);
        System.out.println("Updated Employee Details:");
        employee1.displayEmployeeDetails();

        // Displaying details of the manager
        System.out.println("Manager Details:");
        manager1.displayEmployeeDetails();
    }
}
