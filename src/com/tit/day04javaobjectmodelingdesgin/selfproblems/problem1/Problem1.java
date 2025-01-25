package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem1;

/*
Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.
*/

import java.util.ArrayList;

// Creating class Problem1 to demonstrate the functionalities of the School, Student, and Course classes
class Problem1 {
    public static void main(String[] args) {
        // Creating a School object
        School mySchool = new School("Greenwood High");

        // Creating 15 Student objects and adding them to the school
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            students.add(new Student("Student" + i, 100 + i));
            mySchool.addStudent(students.get(i - 1));
        }

        // Creating 5 Course objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");
        Course history = new Course("History");
        Course computerScience = new Course("Computer Science");

        // Enrolling Students in Courses based on conditions
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) students.get(i).enrollInCourse(math);
            if (i % 3 == 0) students.get(i).enrollInCourse(science);
            if (i % 4 == 0) students.get(i).enrollInCourse(english);
            if (i % 5 == 0) students.get(i).enrollInCourse(history);
            students.get(i).enrollInCourse(computerScience);
        }

        // Displaying all students in the school
        mySchool.displayStudents();

        // Displaying enrolled students for each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        english.displayEnrolledStudents();
        history.displayEnrolledStudents();
        computerScience.displayEnrolledStudents();

        // Displaying enrolled courses for each student
        for (Student student : students) {
            student.displayEnrolledCourses();
        }
    }
}