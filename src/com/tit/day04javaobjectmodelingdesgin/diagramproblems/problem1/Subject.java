package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem1;

// Creating a Subject class to represent individual subjects for students
class Subject {
    private String name;
    private int marks;

    // Constructor to initialize the Subject object with provided name and marks
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter method for the subject name
    public String getName() {
        return name;
    }

    // Getter method for the subject marks
    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}
