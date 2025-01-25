package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem2;

/*
Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.
*/

// Creating class Problem2 to demonstrate the functionalities of the University, Department, and Faculty classes
class Problem2 {
    public static void main(String[] args) {
        // Creating Faculty objects (can exist independently of a University)
        Faculty john = new Faculty("John Doe", "Mathematics");
        Faculty jane = new Faculty("Jane Smith", "Physics");
        Faculty alice = new Faculty("Alice Brown", "Computer Science");

        // Creating a University object
        University myUniversity = new University("Global Tech University");

        // Creating Department objects
        Department mathDepartment = new Department("Mathematics");
        Department csDepartment = new Department("Computer Science");

        // Adding Faculty members to Departments
        mathDepartment.addFaculty(john);
        mathDepartment.addFaculty(jane);
        csDepartment.addFaculty(alice);

        // Adding Departments to the University
        myUniversity.addDepartment(mathDepartment);
        myUniversity.addDepartment(csDepartment);

        // Displaying the University structure
        myUniversity.display();

        // Displaying an independent Faculty member
        System.out.println("\nIndependent Faculty:");
        alice.display();

        // Deleting the University and showing the impact on Departments
        myUniversity.deleteUniversity();
        myUniversity.display(); // Should show that all departments are deleted
    }
}