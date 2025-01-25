package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem1;


import java.util.List;

// Creating a GradeCalculator class to compute grades for students
class GradeCalculator {
    // Method to calculate the grade for a student based on their subject marks
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No subjects enrolled.";
        }

        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }

        double average = totalMarks / subjects.size();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
