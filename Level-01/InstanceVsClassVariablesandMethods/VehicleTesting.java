/*
Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.

*/

// Creating a Class Vehicle to manage vehicle details and registration fee
class Vehicle {
    
    // Declaring instance variables for the Vehicle class
    private String ownerName;
    private String vehicleType;

    // Class variable for the registration fee, shared among all instances
    private static double registrationFee = 1500; // Setting default registration fee

    // Parameterized constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;  // Initializing owner name
        this.vehicleType = vehicleType;  // Initializing vehicle type
    }

    // Getter method for the owner name
    public String getOwnerName() {
        return ownerName;
    }

    // Setter method for the owner name
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter method for the vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    // Setter method for the vehicle type
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Instance method to display the details of a vehicle
    public void displayVehicleDetails() {
        System.out.printf("Owner Name: %s, Vehicle Type: %s, Registration Fee: %.2f%n", this.ownerName, this.vehicleType, Vehicle.registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        Vehicle.registrationFee = newFee;  // Updating the registration fee
    }
}

// Creating a class VehicleTesting to demonstrate the functionalities of the Vehicle class
class VehicleTesting 
{
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Bike");
        
        // Displaying initial vehicle details
        System.out.println("Initial Vehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        
        // Updating the registration fee
        Vehicle.updateRegistrationFee(2000);
        
        // Displaying updated vehicle details
        System.out.println("Updated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
