package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem5;

import java.util.ArrayList;

// Creating a Course class to represent individual courses in the university
class Course {
    // Declaring attributes for the Course class
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    // Constructor to initialize the Course object with provided course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>(); // Initializing the ArrayList of students
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this); // Maintain bidirectional association
        }
    }

    // Method to display course details including the professor and enrolled students
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
