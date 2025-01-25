package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem4;

import java.util.ArrayList;

// Creating a Product class to represent individual products in the e-commerce platform
class Product {
    // Declaring attributes for the Product class
    private String productName;
    private double price;

    // Constructor to initialize the Product object with provided name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getter method for the product name
    public String getProductName() {
        return productName;
    }

    // Getter method for the product price
    public double getPrice() {
        return price;
    }

    // Overriding the toString method to display product information
    @Override
    public String toString() {
        return productName + " ($" + price + ")";
    }
}