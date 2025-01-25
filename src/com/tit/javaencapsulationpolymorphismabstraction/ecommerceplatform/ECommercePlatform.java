package com.tit.javaencapsulationpolymorphismabstraction.ecommerceplatform;

/*

Problem 2: E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of products inherit from a common superclass and override methods as needed.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class ECommercePlatform to demonstrate the functionalities of the Product and its subclasses
class ECommercePlatform {
    public static void main(String[] args) {
        // Creating a list to store products
        List<Product> products = new ArrayList<>();

        // Creating objects for each product type and adding them to the list
        products.add(new Electronics("E001", "Laptop", 60000));
        products.add(new Electronics("E002", "Smartphone", 30000));
        products.add(new Clothing("C001", "T-Shirt", 500));
        products.add(new Clothing("C002", "Jeans", 1200));
        products.add(new Groceries("G001", "Rice", 100));
        products.add(new Groceries("G002", "Milk", 50));

        // Processing and displaying details of each product using polymorphism
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = ((Taxable) product).calculateTax();
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
