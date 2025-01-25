package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem5;

/*
Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.
*/

// Creating class Problem5 to demonstrate the functionalities of the University Management System
class Problem5
{
    public static void main(String[] args) {
        // Creating Professor objects
        Professor profSmith = new Professor("Dr. Smith", "Computer Science");
        Professor profJohnson = new Professor("Dr. Johnson", "Mathematics");

        // Creating Student objects
        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);

        // Creating Course objects
        Course cs101 = new Course("Introduction to Computer Science");
        Course math101 = new Course("Calculus I");

        // Assigning Professors to Courses
        profSmith.assignCourse(cs101);
        profJohnson.assignCourse(math101);

        // Enrolling Students in Courses
        cs101.enrollStudent(alice);
        math101.enrollStudent(alice);
        cs101.enrollStudent(bob);

        // Displaying the courses each student is enrolled in
        alice.displayCourses();
        bob.displayCourses();

        // Displaying the courses each professor teaches
        profSmith.displayCourses();
        profJohnson.displayCourses();

        // Displaying detailed information about each course
        cs101.displayCourseDetails();
        math101.displayCourseDetails();
    }
}

