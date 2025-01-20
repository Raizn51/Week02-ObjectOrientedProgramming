/*
Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
*/


// Creating a class Book to manage library books and their details
class Book 
{
    // Static variable to store the library name shared across all books
    private static String libraryName = "Gourav Library";

    // Static method to display the library name
    public static void displayLibraryName() 
	{
        System.out.println("Library Name: " + libraryName);
		System.out.println();
    }

    // Declaring private attributes for the Book class
    private String title;
    private String author;
    private final String isbn; // Final variable to ensure ISBN cannot be changed

    // Constructor to initialize book details with provided values
    public Book(String title, String author, String isbn) 
	{
        // Using 'this' keyword to resolve ambiguity
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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

    // Getter method for the isbn attribute
    public String getIsbn() {
        return isbn;
    }

    // Method to display book details
    public void displayBookDetails() 
	{
        // Checking if the book object is an instance of the Book class
        if (this instanceof Book) 
		{
            System.out.printf("Title: %s, Author: %s, ISBN: %s%n", this.title, this.author, this.isbn);
        } 
		else 
		{
            System.out.println("Invalid book object.");
        }
		System.out.println();
    }
}

// Creating a class LibraryManagement to demonstrate the functionalities of the Book class
class LibraryManagement 
{
    public static void main(String[] args) {
        // Creating Book objects using the constructor
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567890");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "0987654321");

        // Displaying the library name
        Book.displayLibraryName();

        // Displaying book details
        book1.displayBookDetails();
        book2.displayBookDetails();
		
		book1.displayLibraryName();
    }
}
