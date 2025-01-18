/*
Library Book System: Create a Book class with attributes title, 
author, price, and availability. Implement a method to borrow a book.
*/
// Creating a Class Book to store book details and manage borrowing
class Book 
{
    // Declaring private attributes for the Book class
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor to initialize attributes to default values
    public Book() 
	{
        this.title = "One Piece";          // Setting default title
        this.author = "Eiichiro Oda";        // Setting default author
        this.price = 452.0;                      // Setting default price
        this.availability = true;              // Setting default availability to true
    }

    // Parameterized constructor to initialize attributes with provided values
    public Book(String title, String author, double price, boolean availability) {
        // Initializing title, author, price, and availability with specified values
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Getter method for the title attribute
    public String getTitle() {
        return title;
    }

    // Setter method for the title attribute
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the author attribute
    public String getAuthor() {
        return author;
    }

    // Setter method for the author attribute
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for the price attribute
    public double getPrice() {
        return price;
    }

    // Setter method for the price attribute
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for the availability attribute
    public boolean isAvailable() {
        return availability;
    }

    // Setter method for the availability attribute
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Method to display book details in a readable format
    public void displayBookDetails() {
        // Printing the book details
        System.out.printf("Title: %s, Author: %s, Price: %.2f, Available: %s%n", this.title, this.author, this.price, (this.availability ? "Yes" : "No"));
    }

    // Method to borrow a book
    public void borrowBook() 
	{
        // Checking if the book is available
        if (this.availability) 
		{
            // Setting availability to false as the book is borrowed
            this.availability = false;
            System.out.println("You have successfully borrowed the book: " + this.title);
        } 
		else 
		{
            // Informing user that the book is not available
            System.out.println("Sorry, the book \"" + this.title + "\" is currently unavailable.");
        }
    }
}

// Creating a class LibraryTesting to demonstrate the functionalities of the Book class
class LibraryTesting 
{
    public static void main(String[] args) 
	{
        // Creating a Book object using the parameterized constructor
        Book book1 = new Book("1984", "George Orwell", 19.99, true);
        // Displaying details of the book
        book1.displayBookDetails();

        // Borrowing the book
        book1.borrowBook();
        // Checking the book availability after borrowing
        book1.displayBookDetails();

        // Trying to borrow the book again to see the availability check
        book1.borrowBook();
    }
}
