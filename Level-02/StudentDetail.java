/*
Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details 
about a student as attributes. Methods are used to calculate 
the grade and provide a way to display all information.
*/


// This class represents a student with attributes name, rollNumber, and marks
class Student 
{
    // Attributes to store the name, roll number, and marks of the student
    private String name;
    private String rollNumber;
    private double marks;

    // Constructor to initialize the Student object with name, roll number, and marks
    public Student(String name, String rollNumber, double marks) {
        this.name = name; // Assigning the name to the student
        this.rollNumber = rollNumber; // Assigning the roll number to the student
        this.marks = marks; // Assigning the marks to the student
    }

    // Method to calculate the grade based on the marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details and grade
    public void displayDetails() {
        System.out.println("Name: " + name); // Printing the name of the student
        System.out.println("Roll Number: " + rollNumber); // Printing the roll number of the student
        System.out.println("Marks: " + marks); // Printing the marks of the student
        System.out.println("Grade: " + calculateGrade()); // Printing the calculated grade of the student
    }
}

// This class contains the main method to create and display student details
class StudentDetail 
{
    public static void main(String[] args) {
        // Creating Student objects with predefined details
        Student student1 = new Student("Alice Johnson", "S001", 92.5);
        Student student2 = new Student("Bob Smith", "S002", 85.0);
        Student student3 = new Student("Charlie Brown", "S003", 78.0);
        Student student4 = new Student("Daisy Miller", "S004", 65.5);

        // Displaying the details of each student
        System.out.println("=== Student 1 ===");
        student1.displayDetails(); // Displaying details of student 1

        System.out.println("\n=== Student 2 ===");
        student2.displayDetails(); // Displaying details of student 2

        System.out.println("\n=== Student 3 ===");
        student3.displayDetails(); // Displaying details of student 3

        System.out.println("\n=== Student 4 ===");
        student4.displayDetails(); // Displaying details of student 4
    }
}
