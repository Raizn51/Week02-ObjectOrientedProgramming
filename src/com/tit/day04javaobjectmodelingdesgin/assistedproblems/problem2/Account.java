package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem2;

// Creating a class Account to represent individual bank accounts
class Account
{
    // Declaring attributes for the Account class
    final private String accountNumber;
    private double balance;

    // Constructor to initialize Account objects with provided values
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.printf("Account Number: %s, Balance: %.2f%n", accountNumber, balance);
    }
}