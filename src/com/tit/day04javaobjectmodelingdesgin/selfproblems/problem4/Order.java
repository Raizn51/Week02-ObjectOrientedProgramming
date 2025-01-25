package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem4;
import java.util.ArrayList;

// Creating an Order class to represent customer orders in the e-commerce platform
class Order {
    // Declaring attributes for the Order class
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor to initialize the Order object with provided orderId and customer
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>(); // Initializing the ArrayList of products
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this Order:");
        double total = 0;
        for (Product product : products) {
            System.out.println("  - " + product);
            total += product.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}
