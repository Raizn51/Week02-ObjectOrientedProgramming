/*
Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber
and accountHolder.
*/

// Creating a Class BankAccount to manage bank account details
class BankAccount 
{
    // Declaring public instance variable for account number
    public String accountNumber;
    
    // Declaring protected instance variable for account holder name
    protected String accountHolder;
    
    // Declaring private instance variable for balance
    private double balance;

    // Parameterized constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber; // Initializing account number
        this.accountHolder = accountHolder; // Initializing account holder
        this.balance = balance;             // Initializing balance
    }

    // Public method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.printf("Account Number: %s, Account Holder: %s, Balance: %.2f%n", this.accountNumber, this.accountHolder, this.balance);
    }
}

// Creating a subclass SavingsAccount to demonstrate access to account number and account holder
class SavingsAccount extends BankAccount {
    // Declaring additional attribute for SavingsAccount
    private double interestRate;

    // Parameterized constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        // Calling the superclass constructor to initialize inherited attributes
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate; // Initializing interest rate
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        // Displaying base class details and interest rate
        super.displayAccountDetails(); // Displaying base class details
        System.out.printf("Interest Rate: %.2f%%%n", this.interestRate);
    }
}

// Creating a class BankManagement to demonstrate the functionalities of BankAccount and SavingsAccount classes
class BankManagement 
{
    public static void main(String[] args) {
        // Creating a BankAccount object using the parameterized constructor
        BankAccount account1 = new BankAccount("123456789", "Alice Johnson", 5000.0);
        
        // Creating a SavingsAccount object using the parameterized constructor
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Bob Smith", 8000.0, 2.5);

        // Displaying details of the bank account
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();

        // Modifying and displaying the updated balance of the bank account
        account1.setBalance(5500.0);
        System.out.println("Updated Bank Account Details:");
        account1.displayAccountDetails();

        // Displaying details of the savings account
        System.out.println("Savings Account Details:");
        savingsAccount1.displayAccountDetails();
    }
}
