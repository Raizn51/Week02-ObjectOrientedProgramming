/*
Car Rental System: Create a CarRental class with attributes 
customerName, carModel, and rentalDays. Add constructors to 
initialize the rental details and calculate total cost.
*/
// Creating a Class CarRental to store car rental details and calculate total cost
class CarRental 
{
    // Declaring private attributes for the CarRental class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRatePerDay; // Assuming a fixed rental rate per day for simplicity

    // Default constructor to initialize attributes to default values
    public CarRental() 
	{
        this.customerName = "Gourav Raikwar";  // Setting default customer name
        this.carModel = "Tesla";  // Setting default car model
        this.rentalDays = 1;  // Setting default rental days
        this.rentalRatePerDay = 50.0; // Setting a default rental rate per day
    }

    // Parameterized constructor to initialize attributes with provided values
    public CarRental(String customerName, String carModel, int rentalDays, double rentalRatePerDay) {
        this.customerName = customerName;  // Initializing customer name
        this.carModel = carModel;  // Initializing car model
        this.rentalDays = rentalDays;  // Initializing rental days
        this.rentalRatePerDay = rentalRatePerDay; // Initializing rental rate per day
    }

    // Copy constructor to clone another rental's details
    public CarRental(CarRental another) 
	{
        this.customerName = another.customerName;  // Cloning customer name
        this.carModel = another.carModel;  // Cloning car model
        this.rentalDays = another.rentalDays;  // Cloning rental days
        this.rentalRatePerDay = another.rentalRatePerDay; // Cloning rental rate per day
    }

    // Getter method for the customer name attribute
    public String getCustomerName() {
        return customerName;
    }

    // Setter method for the customer name attribute
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter method for the car model attribute
    public String getCarModel() {
        return carModel;
    }

    // Setter method for the car model attribute
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter method for the rental days attribute
    public int getRentalDays() {
        return rentalDays;
    }

    // Setter method for the rental days attribute
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Getter method for the rental rate per day attribute
    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    // Setter method for the rental rate per day attribute
    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Method to calculate the total cost of the rental
    public double calculateTotalCost() {
        return rentalDays * rentalRatePerDay;
    }

    // Method to display rental details in a readable format
    public void displayRentalDetails() {
        // Printing the rental details
        System.out.printf("Customer Name: %s, Car Model: %s, Rental Days: %d, Total Cost: %.2f%n", this.customerName, this.carModel, this.rentalDays, calculateTotalCost());
    }

}

// Creating a class CarRentalTesting to demonstrate the functionalities of the CarRental class
class CarRentalTesting {
    public static void main(String[] args) {
        // Creating a CarRental object using the default constructor
        CarRental defaultRental = new CarRental();
        // Displaying details of the default rental
        defaultRental.displayRentalDetails();

        // Creating a CarRental object using the parameterized constructor
        CarRental customRental = new CarRental("John Smith", "Toyota Camry", 7, 70.0);
        // Displaying details of the custom rental
        customRental.displayRentalDetails();

        // Creating a CarRental object using the copy constructor
        CarRental clonedRental = new CarRental(customRental);
        // Displaying details of the cloned rental
        clonedRental.displayRentalDetails();
    }
}
