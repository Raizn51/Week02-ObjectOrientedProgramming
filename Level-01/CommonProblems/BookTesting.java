/*
Create a Book class with attributes title, author, and price. 
Provide both default and parameterized constructors.
*/
import java.util.Scanner;

// Creating a Class Book to store book details and display them
class Book 
{
    // Declaring private attributes for the Book class
    private String title;
    private String author;
    private double price;

    // Default constructor for Book class
    public Book() 
	{
        // Initializing attributes to default values
        this.title = "One Piece";
        this.author = "Eiichiro Oda";
        this.price = 454.0;
    }

    // Parameterized constructor for Book class to initialize attributes with provided values
    public Book(String title, String author, double price) 
	{
        // Initializing title, author, and price with specified values
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter method for the title attribute
    public String getTitle() 
	{
        return title;
    }

    // Setter method for the title attribute
    public void setTitle(String title) 
	{
        this.title = title;
    }

    // Getter method for the author attribute
    public String getAuthor() 
	{
        return author;
    }

    // Setter method for the author attribute
    public void setAuthor(String author) 
	{
        this.author = author;
    }

    // Getter method for the price attribute
    public double getPrice() 
	{
        return price;
    }

    // Setter method for the price attribute
    public void setPrice(double price) 
	{
        this.price = price;
    }

    // Method to display book details in a readable format
    public void displayBookDetails() 
	{
        // Printing the book details
        System.out.printf("%-10s \t%-20s \t%-10s%n", "Title", "Author", "Price");
        System.out.printf("%-10s \t%-20s \t%-10.2f%n", this.title, this.author, this.price);
    }
}

// Creating class BookTesting containing the main method to demonstrate the Book class functionality
public class BookTesting 
{
    public static void main(String[] args) 
	{
        // Creating a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of Book using the default constructor
        Book defaultBook = new Book();
        // Displaying details of the default book
        defaultBook.displayBookDetails();

        // Taking user's input for a new book's details using the parameterized constructor
        System.out.print("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book:");
        String author = scanner.nextLine();
        System.out.print("Enter the price of the book:");
        double price = scanner.nextDouble();

        // Creating an instance of Book using the parameterized constructor with user input
        Book userBook1= new Book(title, author, price);
        // Displaying details of the user-input book
        userBook1.displayBookDetails();
		
		// Taking user inputs for a new book's details using methods
        System.out.println("Enter the title of the book:");
        title = scanner.nextLine();
        System.out.println("Enter the author of the book:");
        author = scanner.nextLine();
        System.out.println("Enter the price of the book:");
        price = scanner.nextDouble();

        // Creating an instance of Book using the parameterized constructor with user input
        Book userBook2 = new Book();
        userBook2.setTitle(title);
        userBook2.setAuthor(author);
        userBook2.setPrice(price);
        
        // Using getter methods to display the user-input book's details
        userBook2.displayBookDetails();

 
        // Closing the scanner
        scanner.close();
    }
}
