package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem3;

/*
Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
        Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
*/

// Creating class Problem3 to demonstrate the functionalities of the Hospital, Doctor, and Patient classes
class Problem3
{
    public static void main(String[] args) {
        // Creating a Hospital object
        Hospital myHospital = new Hospital("City Health Hospital");

        // Creating Doctor objects
        Doctor drSmith = new Doctor("Smith", "Cardiology");
        Doctor drJohnson = new Doctor("Johnson", "Neurology");
        Doctor drWilliams = new Doctor("Williams", "Pediatrics");

        // Creating Patient objects
        Patient alice = new Patient("Alice", 101);
        Patient bob = new Patient("Bob", 102);
        Patient charlie = new Patient("Charlie", 103);

        // Adding Doctors and Patients to the Hospital
        myHospital.addDoctor(drSmith);
        myHospital.addDoctor(drJohnson);
        myHospital.addDoctor(drWilliams);

        myHospital.addPatient(alice);
        myHospital.addPatient(bob);
        myHospital.addPatient(charlie);

        // Establishing consultations
        alice.consultDoctor(drSmith);
        alice.consultDoctor(drJohnson);
        bob.consultDoctor(drWilliams);
        bob.consultDoctor(drSmith);
        charlie.consultDoctor(drJohnson);

        // Displaying hospital info
        myHospital.displayHospitalInfo();

        // Displaying consultations
        drSmith.displayPatients();
        drJohnson.displayPatients();
        drWilliams.displayPatients();

        alice.displayDoctors();
        bob.displayDoctors();
        charlie.displayDoctors();

        // Simulating a consultation
        drSmith.consult(alice);
        drWilliams.consult(bob);
    }
}