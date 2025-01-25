package com.tit.day05javainheritance.singleinheritance.librarymanagement;

// Creating a class Book to represent generic books (Superclass)
class Book {
    // Declaring protected attributes for the Book class
    protected String title;
    protected int publicationYear;

    // Constructor to initialize Book objects with provided values
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information, to be overridden in subclasses if needed
    public void displayInfo() {
        System.out.printf("Title: %s, Publication Year: %d\n", title, publicationYear);
    }
}