package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem2;

/*
Sample Problem 2: Grocery Store Bill Generation Application

Class Diagram
The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer.

Object Diagram
An object diagram shows the details of a Customer and the Product objects they have purchased.
Example:
Customer: Alice
Products:
Apples (2 kg at $3 per kg)
Milk (1 liter at $2 per liter)

Sequence Diagram
The sequence diagram shows the process of bill generation for a customer.
Scenario: A customer checks out at the grocery store, and the total bill is generated.
Actors:
        Customer
        BillGenerator
*/

// Main class to demonstrate the functionality of the grocery store bill generation application
public class Problem2 {
    public static void main(String[] args) {
        // Creating Product objects
        Product apples = new Product("Apples", 3.0, 2.0); // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1.0); // 1 liter at $2 per liter

        // Creating a Customer object
        Customer customer = new Customer("Alice");

        // Adding products to the customer's list of purchased products
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Displaying customer details and purchased products
        customer.displayCustomerDetails();

        // Creating a BillGenerator object
        BillGenerator billGenerator = new BillGenerator();

        // Calculating and displaying the total bill for the customer
        double totalBill = billGenerator.calculateTotal(customer);
        System.out.println("Total Bill: $" + totalBill);
    }
}