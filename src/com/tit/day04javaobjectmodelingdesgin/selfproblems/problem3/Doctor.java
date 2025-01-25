package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem3;

import java.util.ArrayList;

// Creating a Doctor class to represent doctors in the hospital
class Doctor {
    // Declaring attributes for the Doctor class
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor to initialize Doctor objects with provided name and specialization
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>(); // Initializing the ArrayList of patients
    }

    // Getter method for the doctor name
    public String getName() {
        return name;
    }

    // Getter method for the doctor specialization
    public String getSpecialization() {
        return specialization;
    }

    // Method to add a patient to the doctor's list of patients
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.consultDoctor(this); // Maintain bidirectional association
        }
    }

    // Method to simulate a consultation with a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " (Specialization: " + specialization + ") is consulting Patient: " + patient.getName());
    }

    // Method to display all patients the doctor is consulting
    public void displayPatients() {
        System.out.println("Dr. " + name + " (Specialization: " + specialization + ") is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getId() + ")");
        }
    }
}

