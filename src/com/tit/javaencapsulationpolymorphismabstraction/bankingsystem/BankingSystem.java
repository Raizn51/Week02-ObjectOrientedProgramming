package com.tit.javaencapsulationpolymorphismabstraction.bankingsystem;

/*

Problem 4: Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of accounts inherit from a common superclass and override methods as needed.
*/
import java.util.ArrayList;
import java.util.List;

// Creating a class BankingSystem to demonstrate the functionalities of the BankAccount and its subclasses
class BankingSystem {
    public static void main(String[] args) {
        // Creating a list to store bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Creating objects for each account type and adding them to the list
        accounts.add(new SavingsAccount("SA001", "Alice", 7000, 3.5));
        accounts.add(new SavingsAccount("SA002", "Bob", 3000, 4.0));
        accounts.add(new SavingsAccount("SA003", "Clara", 10000, 3.0));
        accounts.add(new SavingsAccount("SA004", "David", 1500, 2.5));
        accounts.add(new SavingsAccount("SA005", "Eva", 8000, 3.2));
        accounts.add(new CurrentAccount("CA001", "Frank", 15000, 5000));
        accounts.add(new CurrentAccount("CA002", "Grace", 8000, 3000));
        accounts.add(new CurrentAccount("CA003", "Hank", 12000, 4000));
        accounts.add(new CurrentAccount("CA004", "Ivy", 18000, 7000));
        accounts.add(new CurrentAccount("CA005", "Jack", 9000, 3500));

        // Processing and displaying details of each account using polymorphism
        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);
            boolean isEligibleForLoan = ((Loanable) account).calculateLoanEligibility();
            System.out.println("Loan Eligibility: " + (isEligibleForLoan ? "Eligible" : "Not Eligible"));
            ((Loanable) account).applyForLoan(20000); // Applying for a loan of 20000
            System.out.println();
        }
    }
}
