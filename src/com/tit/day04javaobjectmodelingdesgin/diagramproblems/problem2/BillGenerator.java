package com.tit.day04javaobjectmodelingdesgin.diagramproblems.problem2;

import java.util.List;

// Creating a BillGenerator class to compute the total bill for a customer
class BillGenerator {
    // Method to calculate the total bill for a customer based on their purchased products
    public double calculateTotal(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }
}