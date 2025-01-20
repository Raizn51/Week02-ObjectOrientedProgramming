/*
Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.

*/
// Creating a class Product to manage shopping cart items and their functionalities
class Product 
{
    // Static variable to store the discount percentage shared by all products
    private static double discount = 10.0;

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) 
	{
        discount = newDiscount;
    }

    // Declaring private attributes for the Product class
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Final variable to ensure the product ID cannot be changed

    // Constructor to initialize product details with provided values
    public Product(String productName, double price, int quantity, int productID) {
        // Using 'this' keyword to resolve ambiguity
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Getter method for the productName attribute
    public String getProductName() {
        return productName;
    }

    // Setter method for the productName attribute
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter method for the price attribute
    public double getPrice() {
        return price;
    }

    // Setter method for the price attribute
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for the quantity attribute
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the quantity attribute
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter method for the productID attribute
    public int getProductID() {
        return productID;
    }

    // Method to display product details with discount applied
    public void displayProductDetails() {
        // Checking if the product object is an instance of the Product class
        if (this instanceof Product) 
		{
            double discountedPrice = price - (price * discount / 100);
            System.out.printf("Product Name: %s, Product ID: %d, Price: %.2f, Quantity: %d, Discounted Price: %.2f%n",
                this.productName, this.productID, this.price, this.quantity, discountedPrice);
        } 
		else 
		{
            System.out.println("Invalid product object.");
        }
		System.out.println();
    }
}

// Creating a class ShoppingCartSystem to demonstrate the functionalities of the Product class
class ShoppingCartSystem
{
    public static void main(String[] args) 
	{
        // Creating Product objects using the constructor
        Product prod1 = new Product("Laptop", 1500.00, 2, 201);
        Product prod2 = new Product("Smartphone", 800.00, 5, 202);

		// Displaying product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();
        
		// Updating the discount percentage
        Product.updateDiscount(25.0);

        // Displaying product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
