package com.tit.day05javainheritance.multilevelinheritance.onlineretailordermanagement;

// Creating a class ShippedOrder to represent shipped orders inheriting from Order (Subclass)
class ShippedOrder extends Order {
    // Unique attribute for ShippedOrder
    protected String trackingNumber;

    // Constructor to initialize ShippedOrder objects with provided values
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling the base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus() method to return the shipped status
    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

    // Method to display shipped order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Calling the base class method
        System.out.printf("Tracking Number: %s%n", trackingNumber);
    }
}
