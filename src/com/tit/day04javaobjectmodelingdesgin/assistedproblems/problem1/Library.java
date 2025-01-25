package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem1;

import java.util.ArrayList;

// Creating a class Library to manage a collection of books
class Library
{
    // Declaring attributes for the Library class
    private String name;
    private ArrayList<Book> books;

    // Constructor to initialize the Library object with provided name
    public Library(String name) {
        this.name = name;
        books = new ArrayList<>(); // Initializing the ArrayList of books
    }

    // Getter method for the library name
    public String getName() {
        return name;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle() + " to " + name);
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        System.out.println(name + " contains the following books:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }

    // Method to count the total number of books in the library
    public int getTotalBooks() {
        return books.size();
    }
}