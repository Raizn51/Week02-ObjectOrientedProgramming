package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem2;

import java.util.ArrayList;
import java.util.List;

// Creating a Customer class to represent customers in the grocery store
class Customer {
    private String name;
    private List<Product> products;

    // Constructor to initialize the Customer object with provided name
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>(); // Initializing the ArrayList of products
    }

    // Method to add a product to the customer's list of purchased products
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Getter method for the products
    public List<Product> getProducts() {
        return products;
    }

    // Method to display customer details and purchased products
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Purchased Products:");
        for (Product product : products) {
            System.out.println("  - " + product);
        }
    }
}
