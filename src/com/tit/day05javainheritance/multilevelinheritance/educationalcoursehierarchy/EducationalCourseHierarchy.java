package com.tit.day05javainheritance.multilevelinheritance.educationalcoursehierarchy;

/*
Sample Problem 2: Educational Course Hierarchy (Multilevel Inheritance)
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
*/

// Creating a class EducationalCourseHierarchy to demonstrate the functionalities of the Course and its subclasses
class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Creating objects for each class level
        Course course = new Course("Mathematics 101", 12);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Data Structures", 10, "Coursera", true, 150.0, 20.0);

        // Displaying course details
        course.displayCourseDetails();
        System.out.println();

        onlineCourse.displayCourseDetails();
        System.out.println();

        paidOnlineCourse.displayCourseDetails();
    }
}
