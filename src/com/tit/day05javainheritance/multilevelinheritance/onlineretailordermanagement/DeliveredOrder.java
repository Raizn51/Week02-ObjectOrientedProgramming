package com.tit.day05javainheritance.multilevelinheritance.onlineretailordermanagement;


// Creating a class DeliveredOrder to represent delivered orders inheriting from ShippedOrder (Subclass)
class DeliveredOrder extends ShippedOrder {
    // Unique attribute for DeliveredOrder
    private String deliveryDate;

    // Constructor to initialize DeliveredOrder objects with provided values
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Calling the subclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus() method to return the delivered status
    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }

    // Method to display delivered order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Calling the subclass method
        System.out.printf("Delivery Date: %s%n", deliveryDate);
    }
}
