package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem5;

import java.util.ArrayList;

// Creating a Professor class to represent professors in the university
class Professor {
    // Declaring attributes for the Professor class
    private String name;
    private String department;
    private ArrayList<Course> courses;

    // Constructor to initialize the Professor object with provided name and department
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>(); // Initializing the ArrayList of courses
    }

    // Getter method for the professor name
    public String getName() {
        return name;
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); // Maintain bidirectional association
        }
    }

    // Method to display all courses a professor teaches
    public void displayCourses() {
        System.out.println("Professor: " + name + " (Department: " + department + ") teaches:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}
