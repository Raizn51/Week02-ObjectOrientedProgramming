package com.tit.day05javainheritance.hierarchicalinheritance.schoolsystem;

/*
Sample Problem 2: School System with Different Roles (Hierarchical Inheritance)
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/

// Creating a class SchoolSystem to demonstrate the functionalities of the Person and its subclasses
class SchoolSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "A");
        Staff staff = new Staff("Charlie", 45, "Janitor");

        // Displaying roles and details
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}
