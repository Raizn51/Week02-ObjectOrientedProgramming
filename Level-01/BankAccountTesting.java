/*
Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
*/

// Creating a class BankAccount to manage bank account details and functionality
class BankAccount 
{
    // Static variable to store the bank name shared across all accounts
    private static String bankName = "MyBank";

    // Static variable to keep track of the total number of accounts
    private static int totalAccounts = 0;

    // Declaring private attributes for the BankAccount class
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    // Constructor to initialize account details with provided values
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        // Using 'this' keyword to resolve ambiguity
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Incrementing the total number of accounts
    }

    // Static method to display the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Getter method for the account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for the account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter method for the account number
    public int getAccountNumber() {
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
        } 
		else 
		{
            System.out.println("Deposit amount must be positive.");
        }
		System.out.println();
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
		System.out.println();
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Checking if the account object is an instance of the BankAccount class
        if (this instanceof BankAccount)
		{
            System.out.printf("Account Holder: %s, Account Number: %d, Balance: %.2f%n", this.accountHolderName, this.accountNumber, this.balance);
        } 
		else 
		{
            System.out.println("Invalid account object.");
        }
		System.out.println();
    }
}

// Creating a class BankTesting to demonstrate the functionalities of the BankAccount class
class BankAccountTesting {
    public static void main(String[] args) {
        // Creating BankAccount objects using the constructor
        BankAccount account1 = new BankAccount("Alice Johnson", 12345, 5000.0);
        BankAccount account2 = new BankAccount("Bob Smith", 67890, 3000.0);

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Depositing and withdrawing from the accounts
        account1.deposit(1500.0);
        account1.withdraw(2000.0);
        account1.displayAccountDetails();

        account2.deposit(500.0);
        account2.withdraw(4000.0); // Attempt to withdraw more than the balance
        account2.displayAccountDetails();

        // Displaying the total number of accounts
        BankAccount.getTotalAccounts();
    }
}
