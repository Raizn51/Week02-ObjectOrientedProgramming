/*
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with 
attributes movieName, seatNumber, and price. 
Add methods to:
	Book a ticket (assign seat and update price).
	Display ticket details.
Explanation: The MovieTicket class organizes ticket information 
with attributes. The methods handle booking logic and display 
ticket details.
*/


// MovieTicket class to represent the details of a movie ticket
class MovieTicket 
{
    // Private fields (attributes) to store movie name, seat number, and price
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movieName when creating a new MovieTicket object
    public MovieTicket(String movieName) 
	{
        this.movieName = movieName;
    }

    // Method to book a ticket by assigning a seat number and updating the price
    public void bookTicket(String seatNumber, double price) 
	{
        this.seatNumber = seatNumber;  // Assign the provided seat number to the seatNumber attribute
        this.price = price;            // Assign the provided price to the price attribute
    }

    // Method to display the details of the movie ticket
    public void displayTicketDetails() {
        // Print the movie name
        System.out.println("Movie Name: " + movieName);
        // Print the seat number
        System.out.println("Seat Number: " + seatNumber);
        // Print the price of the ticket
        System.out.println("Price: " + price);
    }
}

// Main class to test the MovieTicket class
public class MovieTicketDetail {
    public static void main(String[] args) 
	{
        // Create a new MovieTicket object for the movie "Inception"
        MovieTicket ticket1 = new MovieTicket("Inception");
        // Book a seat (B15) and set the price (12.75) for the ticket
        ticket1.bookTicket("B15", 12.75);

        // Create another MovieTicket object for the movie "The Matrix"
        MovieTicket ticket2 = new MovieTicket("The Matrix");
        // Book a seat (C20) and set the price (10.50) for the ticket
        ticket2.bookTicket("C20", 10.50);

        // Display the details of the first ticket
        System.out.println("=== Ticket 1 ===");
        ticket1.displayTicketDetails();

        // Display the details of the second ticket
        System.out.println("\n=== Ticket 2 ===");
        ticket2.displayTicketDetails();
    }
}
