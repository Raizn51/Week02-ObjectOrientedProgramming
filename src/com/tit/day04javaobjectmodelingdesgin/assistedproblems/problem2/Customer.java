package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem2;

import java.util.ArrayList;

// Creating a class Customer to represent bank customers
class Customer
{
    // Declaring attributes for the Customer class
    private String name;
    private ArrayList<Account> accounts;

    // Constructor to initialize Customer objects with provided values
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>(); // Initializing the ArrayList of accounts
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Method to add an account to the customer
    public void addAccount(Account account)
    {
        accounts.add(account);
        System.out.println("Added account: " + account.getAccountNumber() + " to customer: " + name);
    }

    // Method to view the balance of all accounts for the customer
    public void viewBalance()
    {
        System.out.println(name + " has the following accounts:");
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}
