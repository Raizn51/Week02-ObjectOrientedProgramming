/*
Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate 
access modifiers.
*/

// Creating a Class Book to manage book details
class Book {
    // Declaring public instance variable for ISBN
    public String ISBN;
    
    // Declaring protected instance variable for title
    protected String title;
    
    // Declaring private instance variable for author
    private String author;

    // Parameterized constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;         // Initializing ISBN
        this.title = title;       // Initializing title
        this.author = author;     // Initializing author
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.printf("ISBN: %s, Title: %s, Author: %s%n", this.ISBN, this.title, this.author);
    }
}

// Creating a subclass EBook to demonstrate access to ISBN and title
class EBook extends Book 
{
    // Declaring additional attribute for EBook
    private double fileSize;

    // Parameterized constructor to initialize ebook details
    public EBook(String ISBN, String title, String author, double fileSize) 
	{
        // Calling the superclass constructor to initialize inherited attributes
        super(ISBN, title, author);
        this.fileSize = fileSize; // Initializing file size
    }

    // Method to display ebook details
    @Override
    public void displayBookDetails() 
	{
        super.displayBookDetails(); // Displaying base class details
        System.out.printf("File Size: %.2f MB%n", this.fileSize);
    }
}

// Creating a class LibraryManagement to demonstrate the functionalities of Book and EBook classes
public class LibraryManagement 
{
    public static void main(String[] args) 
	{
        // Creating a Book object using the parameterized constructor
        Book book1 = new Book("123-456-789", "The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        
        // Creating an EBook object using the parameterized constructor
        EBook ebook1 = new EBook("987-654-321", "Digital Fortress", "Dan Brown", 1.5);

        // Displaying details of the book
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Modifying and displaying the updated author of the book
        book1.setAuthor("Douglas N. Adams");
        System.out.println("Updated Book Details:");
        book1.displayBookDetails();

        // Displaying details of the ebook
        System.out.println("EBook Details:");
        ebook1.displayBookDetails();
    }
}
