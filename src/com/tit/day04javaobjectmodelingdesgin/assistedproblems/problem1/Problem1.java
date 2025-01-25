package com.tit.day04javaobjectmodelingdesgin.assistedproblems.problem1;
/*Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
*/

// Creating a class Problem1 to demonstrate the functionalities of the Library and Book classes
class Problem1
{
    public static void main(String[] args) {
        // Creating Book objects independently
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book5 = new Book("Moby Dick", "Herman Melville");
        Book book6 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book7 = new Book("Brave New World", "Aldous Huxley");
        Book book8 = new Book("War and Peace", "Leo Tolstoy");
        Book book9 = new Book("Ulysses", "James Joyce");
        Book book10 = new Book("The Odyssey", "Homer");
        Book book11 = new Book("Jane Eyre", "Charlotte Bronte");
        Book book12 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book13 = new Book("Fahrenheit 451", "Ray Bradbury");
        Book book14 = new Book("Crime and Punishment", "Fyodor Dostoevsky");
        Book book15 = new Book("Wuthering Heights", "Emily Bronte");

        // Creating Library objects and adding books to them
        Library library1 = new Library("Central Library");
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        library1.addBook(book6);
        library1.addBook(book7);
        library1.addBook(book8);

        Library library2 = new Library("Community Library");
        library2.addBook(book9);
        library2.addBook(book10);
        library2.addBook(book11);
        library2.addBook(book12);
        library2.addBook(book13);
        library2.addBook(book14);
        library2.addBook(book15);

        // Displaying books in each library
        System.out.println("\n" + library1.getName() + ":");
        library1.displayAllBooks();
        System.out.println("Total books in " + library1.getName() + ": " + library1.getTotalBooks());

        System.out.println("\n" + library2.getName() + ":");
        library2.displayAllBooks();
        System.out.println("Total books in " + library2.getName() + ": " + library2.getTotalBooks());
    }
}