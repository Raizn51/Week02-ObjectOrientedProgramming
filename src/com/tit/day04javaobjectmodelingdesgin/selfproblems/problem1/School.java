package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem1;

import java.util.ArrayList;


// Creating a School class to manage students and courses
class School {
    // Declaring attributes for the School class
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor to initialize the School object with provided name
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>(); // Initializing the ArrayList of students
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
