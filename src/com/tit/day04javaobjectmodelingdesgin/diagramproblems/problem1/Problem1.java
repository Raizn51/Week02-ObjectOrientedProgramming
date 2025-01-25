package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem1;


/*
Sample Problem 1: School Results Application
Class Diagram
The class diagram represents the structure of a school results application where students have subjects, and their scores are calculated for grades.
Diagram Description:
Classes: Student, Subject, GradeCalculator
Relationships:
A Student has multiple Subject entries (Aggregation).
GradeCalculator computes the results for a Student.

Object Diagram
An object diagram provides a snapshot of the Student and their Subject objects at a particular point.
Example:
Student: John
Subjects: Maths, Science
Marks: 90, 85

Sequence Diagram
The sequence diagram shows how objects interact to calculate grades.
Scenario: A student requests their grade based on marks in subjects.
Actors:
Student
GradeCalculator
*/

// Main class to demonstrate the functionality of the school results application
public class Problem1 {
    public static void main(String[] args) {
        // Creating Student objects
        Student john = new Student("John", 1);
        Student jane = new Student("Jane", 2);

        // Adding subjects to students
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        jane.addSubject(new Subject("Maths", 75));
        jane.addSubject(new Subject("Science", 80));

        // Displaying student details
        john.displayStudentDetails();
        jane.displayStudentDetails();

        // Calculating and displaying grades for students
        GradeCalculator gradeCalculator = new GradeCalculator();
        System.out.println("Grade for John: " + gradeCalculator.calculateGrade(john));
        System.out.println("Grade for Jane: " + gradeCalculator.calculateGrade(jane));
    }
}

