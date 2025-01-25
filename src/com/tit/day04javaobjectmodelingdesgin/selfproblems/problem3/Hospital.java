package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem3;

import java.util.ArrayList;

// Creating a Hospital class to manage doctors and patients
class Hospital {
    // Declaring attributes for the Hospital class
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor to initialize the Hospital object with provided name
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>(); // Initializing the ArrayList of doctors
        this.patients = new ArrayList<>(); // Initializing the ArrayList of patients
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Method to display all doctors and patients in the hospital
    public void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getId() + ")");
        }
    }
}
