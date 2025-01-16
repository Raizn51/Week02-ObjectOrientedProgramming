/*
Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes 
brand, model, and price. Add a method to display all the details
of the phone. The MobilePhone class uses attributes to store the 
phone's characteristics. The method is used to retrieve and 
display this information for each object.
*/

// This class represents a mobile phone with attributes brand, model, and price
class MobilePhone
 {
    // Attributes to store the brand, model, and price of the mobile phone
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the MobilePhone object with brand, model, and price
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand; // Assigning the brand to the mobile phone
        this.model = model; // Assigning the model to the mobile phone
        this.price = price; // Assigning the price to the mobile phone
    }

    // Method to display all the details of the mobile phone
    public void displayDetails() {
        System.out.println("Brand: " + brand); // Printing the brand of the mobile phone
        System.out.println("Model: " + model); // Printing the model of the mobile phone
        System.out.println("Price: " + price); // Printing the price of the mobile phone
    }
}

// This class contains the main method to create and display mobile phone details
class MobilePhoneDetail 
{
    public static void main(String[] args) 
	{
        // Creating MobilePhone objects with predefined details
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 13", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        MobilePhone phone3 = new MobilePhone("OnePlus", "9 Pro", 969.00);
        MobilePhone phone4 = new MobilePhone("Google", "Pixel 6", 599.00);

        // Displaying the details of each mobile phone
        System.out.println("=== Mobile Phone 1 ===");
        phone1.displayDetails(); // Displaying details of phone 1

        System.out.println("\n=== Mobile Phone 2 ===");
        phone2.displayDetails(); // Displaying details of phone 2

        System.out.println("\n=== Mobile Phone 3 ===");
        phone3.displayDetails(); // Displaying details of phone 3

        System.out.println("\n=== Mobile Phone 4 ===");
        phone4.displayDetails(); // Displaying details of phone 4
    }
}
