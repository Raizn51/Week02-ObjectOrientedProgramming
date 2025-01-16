/*
Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode,
itemName, and price. Add a method to display item details and 
calculate the total cost for a given quantity.
*/

// This class represents an item with an item code, name, and price
class Item 
{
    // Attributes to store the item code, name, and price of the item
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the Item object with item code, name, and price
    public Item(String itemCode, String itemName, double price) 
	{
        this.itemCode = itemCode; // Assigning the item code to the item
        this.itemName = itemName; // Assigning the name to the item
        this.price = price; // Assigning the price to the item
    }

    // Method to display the item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode); // Printing the item code
        System.out.println("Item Name: " + itemName); // Printing the item name
        System.out.println("Price: " + price); // Printing the price of the item
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) 
	{
        return price * quantity; // Calculating the total cost
    }
}
// This class contains the main method to create and display item details and calculate total cost
class Inventory
{
    public static void main(String[] args) 
	{
        // Creating Item objects with predefined details
        Item item1 = new Item("I001", "Laptop", 750.0);
        Item item2 = new Item("I002", "Smartphone", 500.0);
        Item item3 = new Item("I003", "Tablet", 300.0);
        Item item4 = new Item("I004", "Headphones", 100.0);

        // Displaying the details of each item and calculating total cost for a given quantity
        System.out.println("=== Item 1 ===");
        item1.displayDetails(); // Displaying details of item 1
        System.out.println("Total Cost for 2 units: $" + item1.calculateTotalCost(2)); // Calculating total cost for 2 units of item 1

        System.out.println("\n=== Item 2 ===");
        item2.displayDetails(); // Displaying details of item 2
        System.out.println("Total Cost for 3 units: $" + item2.calculateTotalCost(3)); // Calculating total cost for 3 units of item 2

        System.out.println("\n=== Item 3 ===");
        item3.displayDetails(); // Displaying details of item 3
        System.out.println("Total Cost for 1 unit: $" + item3.calculateTotalCost(1)); // Calculating total cost for 1 unit of item 3

        System.out.println("\n=== Item 4 ===");
        item4.displayDetails(); // Displaying details of item 4
        System.out.println("Total Cost for 5 units: $" + item4.calculateTotalCost(5)); // Calculating total cost for 5 units of item 4
    }
}
