/*
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with 
attributes title, author, and price. Add a method to display the
book details.

*/

// This class Book represents a book with a title, author, and price
class Book 
{
    // Attributes to store the title, author, and price of the book
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the Book object with title, author, and price
    public Book(String title, String author, double price) 
	{
        this.title = title; // Assigning the title to the book
        this.author = author; // Assigning the author to the book
        this.price = price; // Assigning the price to the book
    }

    // Method to display the book details
    public void displayDetails() 
	{
        System.out.println("Title: " + title); // Printing the title of the book
        System.out.println("Author: " + author); // Printing the author of the book
        System.out.println("Price: " + price); // Printing the price of the book
    }
}


//class BookDetail contains the main method to create and display book details
class BookDetail 
{
    public static void main(String[] args) 
	{
        // Creating Book objects with predefined details
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50);
        Book book3 = new Book("1984", "George Orwell", 14.75);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 9.99);

        // Displaying the details of each book
        System.out.println("=== Book 1 ===");
        book1.displayDetails(); // Displaying details of book 1
        System.out.println("\n=== Book 2 ===");
        book2.displayDetails(); // Displaying details of book 2
        System.out.println("\n=== Book 3 ===");
        book3.displayDetails(); // Displaying details of book 3
        System.out.println("\n=== Book 4 ===");
        book4.displayDetails(); // Displaying details of book 4
    }
}

