/*
Hotel Booking System: Create a HotelBooking class with attributes 
guestName, roomType, and nights. Use default, parameterized, and 
copy constructors to initialize bookings.
*/
// HotelBooking class to handle hotel booking details
class HotelBooking 
{
    // Declaring private attributes for the HotelBooking class
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor to initialize attributes to default values
    public HotelBooking() 
	{
        this.guestName = "Gourav";  // Setting default guest name
        this.roomType = "Standard";        // Setting default room type
        this.nights = 1;                   // Setting default number of nights
    }

    // Parameterized constructor to initialize attributes with provided values
    public HotelBooking(String guestName, String roomType, int nights)
	{
        // Initializing guestName, roomType, and nights with specified values
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor to clone another booking's attributes
    public HotelBooking(HotelBooking another) 
	{
        // Cloning guestName, roomType, and nights from another booking
        this.guestName = another.guestName;
        this.roomType = another.roomType;
        this.nights = another.nights;
    }

    // Getter method for the guest name attribute
    public String getGuestName() {
        return guestName;
    }

    // Setter method for the guest name attribute
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter method for the room type attribute
    public String getRoomType() {
        return roomType;
    }

    // Setter method for the room type attribute
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter method for the nights attribute
    public int getNights() {
        return nights;
    }

    // Setter method for the nights attribute
    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details in a readable format
    public void displayBookingDetails() {
        // Printing the booking details
        System.out.printf("Guest Name: %s, Room Type: %s, Nights: %d%n", this.guestName, this.roomType, this.nights);
    }
}

// Creating a class HotelBookingDemo to demonstrate the functionalities of the HotelBooking class
class HotelBookingTesting 
{
    public static void main(String[] args) {
        // Creating a HotelBooking object using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        // Displaying details of the default booking
        defaultBooking.displayBookingDetails();

        // Creating a HotelBooking object using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Alice Smith", "Deluxe", 3);
        // Displaying details of the custom booking
        customBooking.displayBookingDetails();

        // Creating a HotelBooking object using the copy constructor
        HotelBooking clonedBooking = new HotelBooking(customBooking);
        // Displaying details of the cloned booking
        clonedBooking.displayBookingDetails();
    }
}
