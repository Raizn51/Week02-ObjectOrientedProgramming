/*
Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
*/

// Creating a Class Product to manage the product details and keep track of total products
class Product 
{
    // Declaring instance variables for the Product class
    private String productName;
    private double price;
    
    // Class variable to keep track of total products, shared among all instances
    private static int totalProducts = 0;

    // Parameterized constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName; // Initializing product name
        this.price = price;             // Initializing price
        totalProducts++;                // Incrementing total products count whenever a new product is created
    }

    // Getter method for the product name
    public String getProductName() {
        return productName;
    }

    // Setter method for the product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter method for the price
    public double getPrice() {
        return price;
    }

    // Setter method for the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Instance method to display the details of a product
    public void displayProductDetails() {
        System.out.printf("Product Name: %s, Price: %.2f%n", this.productName, this.price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

// Creating a class ProductTesting to demonstrate the functionalities of the Product class
class ProductTesting 
{
    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 75000);
        Product product2 = new Product("Smartphone", 50000);
        
        // Displaying product details
        System.out.println("Product1 Details:");
        product1.displayProductDetails();
        System.out.println("Product2 Details:");
        product2.displayProductDetails();
        
        // Displaying total number of products
        Product.displayTotalProducts();
    }
}
