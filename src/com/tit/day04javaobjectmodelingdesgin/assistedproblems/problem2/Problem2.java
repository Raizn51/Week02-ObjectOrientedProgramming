package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem2;

/*Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.
*/

// Creating a class Problem2 to demonstrate the functionalities of the Bank, Customer, and Account classes
class Problem2
{
    public static void main(String[] args)
    {
        // Creating Bank object
        Bank bank = new Bank("MyBank");

        // Creating Customer objects
        Customer customer1 = new Customer("Alice Johnson");
        Customer customer2 = new Customer("Bob Smith");

        // Creating Account objects
        Account account1 = new Account("12345", 5000.0);
        Account account2 = new Account("67890", 3000.0);
        Account account3 = new Account("54321", 7000.0);
        Account account4 = new Account("09876", 10000.0);

        // Opening accounts for customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);
        bank.openAccount(customer2, account4);

        // Displaying all customers and their accounts in the bank
        System.out.println("\n" + bank.getName() + ":");
        bank.displayAllCustomers();
    }
}