package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem1;

import java.util.ArrayList;

// Creating a Course class to represent courses offered at the school
class Course
{
    // Declaring attributes for the Course class
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize Course objects with provided course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>(); // Initializing the ArrayList of enrolled students
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Maintain bidirectional association
        }
    }

    // Getter method for the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to display all enrolled students in the course
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}
