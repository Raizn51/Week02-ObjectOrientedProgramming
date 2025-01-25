package com.tit.day05javainheritance.multilevelinheritance.onlineretailordermanagement;

/*
Sample Problem 1: Online Retail Order Management (Multilevel Inheritance)
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/

// Creating a class OnlineRetailOrderManagement to demonstrate the functionalities of the Order and its subclasses
class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Creating objects for each class level
        Order order = new Order("ORD001", "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-02", "TRK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-03", "TRK124", "2025-01-05");

        // Displaying order statuses and details
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus() + "\n");

        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus() + "\n");

        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
