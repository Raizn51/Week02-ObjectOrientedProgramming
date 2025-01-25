package com.tit.day05javainheritance.singleinheritance.librarymanagement;

/*
 *
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*
*/

// Creating a class LibraryManagement to demonstrate the functionalities of the Book and Author classes
class LibraryManagement {
    public static void main(String[] args) {
        // Creating Author objects
        Author author1 = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "An American fiction writer, whose works illustrate the Jazz Age.");
        Author author2 = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "An American novelist widely known for 'To Kill a Mockingbird', published in 1960.");
        Author author3 = new Author("1984", 1949, "George Orwell", "An English novelist, essayist, journalist and critic.");
        Author author4 = new Author("Pride and Prejudice", 1813, "Jane Austen", "An English novelist known for her six major novels.");
        Author author5 = new Author("The Catcher in the Rye", 1951, "J.D. Salinger", "An American writer known for his widely-read novel, 'The Catcher in the Rye'.");

        // Displaying details of the books and their authors
        author1.displayInfo();
        author2.displayInfo();
        author3.displayInfo();
        author4.displayInfo();
        author5.displayInfo();
    }
}
