package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem4;

import java.util.ArrayList;

// Creating a Customer class to represent customers in the e-commerce platform
class Customer {
    // Declaring attributes for the Customer class
    private String name;
    private int customerId;
    private ArrayList<Order> orders;

    // Constructor to initialize the Customer object with provided name and customerId
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.orders = new ArrayList<>(); // Initializing the ArrayList of orders
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Method for the customer to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

