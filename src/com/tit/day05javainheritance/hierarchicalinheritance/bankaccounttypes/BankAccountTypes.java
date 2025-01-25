package com.tit.day05javainheritance.hierarchicalinheritance.bankaccounttypes;

/*
Sample Problem 1: Bank Account Types (Hierarchical Inheritance)
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
*/

// Creating a class BankAccountTypes to demonstrate the functionalities of the BankAccount and its subclasses
class BankAccountTypes {
    public static void main(String[] args) {
        // Creating objects for each subclass
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA123", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD123", 10000.0, 12000.0);

        // Displaying account types and details
        savings.displayAccountType();
        savings.displayAccountDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayAccountDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}
