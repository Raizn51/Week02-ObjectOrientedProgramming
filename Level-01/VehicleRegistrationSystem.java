/*
Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.

*/
// Creating a class Vehicle to manage vehicle registration details and functionalities
class Vehicle
{
    // Static variable to store the registration fee shared by all vehicles
    private static double registrationFee = 500.0;

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Declaring private attributes for the Vehicle class
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final variable to ensure the registration number cannot be changed

    // Constructor to initialize vehicle details with provided values
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        // Using 'this' keyword to resolve ambiguity
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Getter method for the ownerName attribute
    public String getOwnerName() {
        return ownerName;
    }

    // Setter method for the ownerName attribute
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter method for the vehicleType attribute
    public String getVehicleType() {
        return vehicleType;
    }

    // Setter method for the vehicleType attribute
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getter method for the registrationNumber attribute
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Method to display vehicle registration details
    public void displayVehicleDetails()
	{
        // Checking if the vehicle object is an instance of the Vehicle class
        if (this instanceof Vehicle) {
            System.out.printf("Owner Name: %s, Vehicle Type: %s, Registration Number: %s, Registration Fee: %.2f%n",
                this.ownerName, this.vehicleType, this.registrationNumber, registrationFee);
        } 
		else 
		{
            System.out.println("Invalid vehicle object.");
        }
		System.out.println();
    }
}

// Creating a class VehicleRegistrationSystem to demonstrate the functionalities of the Vehicle class
public class VehicleRegistrationSystem 
{
    public static void main(String[] args) 
	{
        // Creating Vehicle objects using the constructor
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car", "REG123456");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorbike", "REG654321");

		// Displaying vehicle registration details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
		
        // Updating the registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Displaying vehicle registration details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
