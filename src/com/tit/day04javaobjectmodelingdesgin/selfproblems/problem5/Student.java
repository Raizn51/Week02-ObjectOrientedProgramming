package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem5;

import java.util.ArrayList;

// Creating a Student class to represent students in the university
class Student {
    // Declaring attributes for the Student class
    private String name;
    private int id;
    private ArrayList<Course> courses;

    // Constructor to initialize the Student object with provided name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>(); // Initializing the ArrayList of courses
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Method to display all courses a student is enrolled in
    public void displayCourses() {
        System.out.println("Student: " + name + " (ID: " + id + ") is enrolled in:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}
