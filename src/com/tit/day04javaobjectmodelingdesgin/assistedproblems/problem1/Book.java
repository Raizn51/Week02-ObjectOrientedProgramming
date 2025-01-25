package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem1;

// Creating a class Book to represent individual books
class Book {
    // Declaring attributes for the Book class
    private String title;
    private String author;

    // Constructor to initialize Book objects with provided values
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    // Getter method for the title
    public String getTitle() {
        return title;
    }

    // Getter method for the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails()
    {
        System.out.printf("Title: %s, Author: %s%n", title, author);
    }
}
