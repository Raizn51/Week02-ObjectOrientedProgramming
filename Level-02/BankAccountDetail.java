/*
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an 
attribute text. 
Add methods to:
	Check if the text is a palindrome.
	Display the result.
Explanation: The PalindromeChecker class holds the text 
attribute. The methods operate on this attribute to verify 
its palindrome status and display the result.
*/

// This class represents a bank account with attributes accountHolder, accountNumber, and balance
class BankAccount 
{
    // Attributes to store the account holder's name, account number, and balance
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount object with account holder's name, account number, and balance
    public BankAccount(String accountHolder, String accountNumber, double balance) 
	{
        this.accountHolder = accountHolder; // Assigning the account holder's name to the bank account
        this.accountNumber = accountNumber; // Assigning the account number to the bank account
        this.balance = balance; // Assigning the balance to the bank account
    }

    // Method to deposit money into the bank account
    public void deposit(double amount) 
	{
        if (amount > 0) {
            balance += amount; // Adding the deposit amount to the balance
            System.out.println("Deposited: $" + amount);
        } 
		else 
		{
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money from the bank account (only if sufficient balance exists)
    public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount; // Subtracting the withdrawal amount from the balance
            System.out.println("Withdrew: $" + amount);
        } 
		else if (amount > balance) 
		{
            System.out.println("Insufficient balance for withdrawal.");
        } 
		else 
		{
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Method to display the current balance of the bank account
    public void displayBalance() 
	{
        System.out.println("Current balance: $" + balance); // Printing the current balance of the bank account
    }

    // Method to display the account details
    public void displayAccountDetails() 
	{
        System.out.println("Account Holder: " + accountHolder); // Printing the account holder's name
        System.out.println("Account Number: " + accountNumber); // Printing the account number
        System.out.println("Balance: $" + balance); // Printing the current balance
    }
}


// This class contains the main method to simulate an ATM for bank account transactions
class BankAccountDetail 
{
    public static void main(String[] args) 
	{
        // Creating a BankAccount object with predefined details
        BankAccount account1 = new BankAccount("John Doe", "1234567890", 1000.00);

        // Displaying the account details
        System.out.println("=== Account Details ===");
        account1.displayAccountDetails(); // Displaying details of account 1

        // Performing deposit, withdrawal, and balance display operations
        System.out.println("\n=== Deposit Money ===");
        account1.deposit(500.00); // Depositing money into account 1
        account1.displayBalance(); // Displaying the current balance after deposit

        System.out.println("\n=== Withdraw Money ===");
        account1.withdraw(200.00); // Withdrawing money from account 1
        account1.displayBalance(); // Displaying the current balance after withdrawal

        System.out.println("\n=== Withdraw Money (Exceeding Balance) ===");
        account1.withdraw(1500.00); // Attempting to withdraw more than the available balance
        account1.displayBalance(); // Displaying the current balance after failed withdrawal
    }
}
