package com.tit.day04javaobjectmodelingdesgin.selfproblems.problem4;

/*
Problem 4: E-commerce Platform with Orders, Customers, and Products
Description: Design an e-commerce platform with Order, Customer, and Product classes. Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.
*/
// Creating class Problem4 to demonstrate the functionalities of the e-commerce platform
class Problem4
{
    public static void main(String[] args) {
        // Creating Product objects
        Product laptop = new Product("Laptop", 800.00);
        Product phone = new Product("Smartphone", 500.00);
        Product headphones = new Product("Headphones", 100.00);

        // Creating a Customer object
        Customer customer = new Customer("John Doe", 101);

        // Creating Order objects and adding products to them
        Order order1 = new Order(1, customer);
        order1.addProduct(laptop);
        order1.addProduct(phone);

        Order order2 = new Order(2, customer);
        order2.addProduct(headphones);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Displaying all orders placed by the customer
        customer.displayCustomerOrders();
    }
}

