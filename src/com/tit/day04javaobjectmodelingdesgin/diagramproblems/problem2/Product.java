package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem2;

// Creating a Product class to represent individual products in the grocery store
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize the Product object with provided name, price per unit, and quantity
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getter method for the product name
    public String getName() {
        return name;
    }

    // Getter method for the product price per unit
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Getter method for the product quantity
    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the product
    public double calculateTotalPrice() {
        return pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}
