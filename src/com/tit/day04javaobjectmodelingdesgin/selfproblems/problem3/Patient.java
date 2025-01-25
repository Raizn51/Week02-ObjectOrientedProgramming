package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem3;

import java.util.ArrayList;

// Creating a Patient class to represent patients in the hospital
class Patient {
    // Declaring attributes for the Patient class
    private String name;
    private int id;
    private ArrayList<Doctor> doctors;

    // Constructor to initialize Patient objects with provided name and id
    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.doctors = new ArrayList<>(); // Initializing the ArrayList of doctors
    }

    // Getter method for the patient name
    public String getName() {
        return name;
    }

    // Method to add a doctor to the patient's list of consulting doctors
    public void consultDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Maintain bidirectional association
        }
    }

    // Method to display all doctors the patient is consulting
    public void displayDoctors() {
        System.out.println("Patient: " + name + " (ID: " + id + ") is consulting:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")");
        }
    }

    public int getId() {
        return id;
    }
}
