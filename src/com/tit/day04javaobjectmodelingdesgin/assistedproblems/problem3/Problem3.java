package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem3;

/*
Problem 3: Company and Departments (Composition)
Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
Tasks:
Define a Company class that contains multiple Department objects.
Define an Employee class within each Department.
Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company
*/

// Creating class Problem3 to demonstrate the functionalities of the Company, Department, and Employee classes
class Problem3
{
    public static void main(String[] args)
    {
        // Creating a Company object
        Company myCompany = new Company("TechCorp");

        // Adding Departments to the company
        myCompany.addDepartment("Engineering");
        myCompany.addDepartment("HR");

        // Adding Employees to Departments
        Department engineering = myCompany.getDepartment("Engineering");
        if (engineering != null) {
            engineering.addEmployee("Alice", 101);
            engineering.addEmployee("Bob", 102);
        }

        Department hr = myCompany.getDepartment("HR");
        if (hr != null) {
            hr.addEmployee("Charlie", 201);
        }

        // Displaying the Company structure
        myCompany.display();

        // Setting myCompany to null and suggesting garbage collection
        myCompany = null;
        System.gc();

        // Note: The finalize method may not run immediately or at all, depending on JVM optimizations.
    }
}
