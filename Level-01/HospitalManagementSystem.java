/*
Sample Program 7: Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
*/

// Creating a class Patient to manage patient details and functionalities
class Patient {
    // Static variable to store the hospital name shared by all patients
    private static String hospitalName = "Gourav Hospital";

    // Static variable to keep track of the total number of patients
    private static int totalPatients = 0;

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Declaring private attributes for the Patient class
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final variable to ensure the patient ID cannot be changed

    // Constructor to initialize patient details with provided values
    public Patient(String name, int age, String ailment, int patientID) {
        // Using 'this' keyword to resolve ambiguity
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Incrementing the total number of patients
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age attribute
    public int getAge() {
        return age;
    }

    // Setter method for the age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for the ailment attribute
    public String getAilment() {
        return ailment;
    }

    // Setter method for the ailment attribute
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    // Getter method for the patientID attribute
    public int getPatientID() {
        return patientID;
    }

    // Method to display patient details
    public void displayPatientDetails() 
	{
        // Checking if the patient object is an instance of the Patient class
        if (this instanceof Patient) 
		{
            System.out.printf("Name: %s	Age: %d	Ailment: %s		Patient ID: %d		Hospital: %s%n",
                this.name, this.age, this.ailment, this.patientID, hospitalName);
        } 
		else 
		{
            System.out.println("Invalid patient object.");
        }
		System.out.println();
    }
}

// Creating a class HospitalManagementSystem to demonstrate the functionalities of the Patient class
public class HospitalManagementSystem 
{
    public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			// Creating Patient objects using the constructor
			Patient patient1 = new Patient("John Doe "+ Integer.toString(i), 45+i, "Flu " + Integer.toString(i), 101+i);
			Patient patient2 = new Patient("Jane Smith "+ Integer.toString(i), 30+i, "Fever " + Integer.toString(i), 102+i);

			// Displaying patient details
			patient1.displayPatientDetails();
			patient2.displayPatientDetails();
  
		}
		// Displaying the total number of patients
		System.out.println("Total patients admitted: " + Patient.getTotalPatients()); 
	}
}
