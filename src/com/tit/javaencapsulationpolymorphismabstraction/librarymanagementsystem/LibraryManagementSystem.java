package com.tit.javaencapsulationpolymorphismabstraction.librarymanagementsystem;

/*

Problem 5: Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.

Goal: Understand inheritance and polymorphism by modeling a real-world relationship where different types of library items inherit from a common superclass and override methods as needed.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class LibraryManagementSystem to demonstrate the functionalities of the LibraryItem and its subclasses
class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a list to store library items
        List<LibraryItem> items = new ArrayList<>();

        // Creating objects for each item type and adding them to the list
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        items.add(new Book("B003", "1984", "George Orwell"));
        items.add(new Book("B004", "The Catcher in the Rye", "J.D. Salinger"));
        items.add(new Book("B005", "Pride and Prejudice", "Jane Austen"));
        items.add(new Magazine("M001", "National Geographic", "Various Authors"));
        items.add(new Magazine("M002", "Time", "Various Authors"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));
        items.add(new DVD("D002", "The Godfather", "Francis Ford Coppola"));
        items.add(new DVD("D003", "The Dark Knight", "Christopher Nolan"));

        // Processing and displaying details of each item using polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            int loanDuration = item.getLoanDuration();
            System.out.println("Loan Duration: " + loanDuration + " days");

            boolean isAvailable = ((Reservable) item).checkAvailability();
            System.out.println("Availability: " + (isAvailable ? ("Available\n"+((Reservable) item).reserveItem()) : ("Not Available")));
            System.out.println();
        }
    }
}
