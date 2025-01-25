package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem1;

import java.util.ArrayList;
import java.util.List;

// Creating a Student class to represent students in the school
class Student {
    private String name;
    private int id;
    private List<Subject> subjects;

    // Constructor to initialize the Student object with provided name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>(); // Initializing the ArrayList of subjects
    }

    // Method to add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Getter method for the student id
    public int getId() {
        return id;
    }

    // Getter method for the subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Method to display student details and subjects
    public void displayStudentDetails() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Subjects:");
        for (Subject subject : subjects) {
            System.out.println("  - " + subject);
        }
    }
}
