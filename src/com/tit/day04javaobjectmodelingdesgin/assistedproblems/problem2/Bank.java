package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem2;

import java.util.ArrayList;

// Creating a class Bank to manage customers and accounts
class Bank
{
    // Declaring attributes for the Bank class
    private String name;
    private ArrayList<Customer> customers;

    // Constructor to initialize the Bank object with provided name
    public Bank(String name)
    {
        this.name = name;
        customers = new ArrayList<>(); // Initializing the ArrayList of customers
    }

    // Getter method for the bank name
    public String getName() {
        return name;
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Added customer: " + customer.getName() + " to bank: " + name);
        }
    }

    // Method to display all customers in the bank
    public void displayAllCustomers() {
        System.out.println(name + " has the following customers:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            customer.viewBalance();
        }
    }
}