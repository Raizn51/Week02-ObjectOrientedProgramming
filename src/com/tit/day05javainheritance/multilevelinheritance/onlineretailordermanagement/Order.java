package com.tit.day05javainheritance.multilevelinheritance.onlineretailordermanagement;

// Creating a class Order to represent generic orders (Base Class)
class Order {
    // Declaring protected attributes for the Order class
    protected String orderId;
    protected String orderDate;

    // Constructor to initialize Order objects with provided values
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the order status, to be overridden in subclasses if needed
    public String getOrderStatus() {
        return "Order placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.printf("Order ID: %s, Order Date: %s%n", orderId, orderDate);
    }
}
