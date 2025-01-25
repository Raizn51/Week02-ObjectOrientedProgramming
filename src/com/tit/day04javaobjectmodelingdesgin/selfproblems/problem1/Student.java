package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem1;

import java.util.ArrayList;

// Creating a Student class to represent students in the school
class Student {
    // Declaring attributes for the Student class
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    // Constructor to initialize Student objects with provided name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>(); // Initializing the ArrayList of enrolled courses
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Maintain bidirectional association
        }
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Method to display all courses the student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " (ID: " + id + ") - Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }
}
