/*
Create a Person class with a copy constructor that clones another 
person's attributes.
*/

// Creating a Class Person to store person details and a copy constructor to clone another person
class Person 
{
    // Declaring private attributes for the Person class
    private String name;
    private int age;
    private String address;

    // Default constructor to initialize attributes to default values
    public Person() 
	{
        this.name = "Gourav Raikwar";  // Setting default name
        this.age = 21;                // Setting default age
        this.address = "Bhopal";  // Setting default address
    }

    // Parameterized constructor to initialize attributes with provided values
    public Person(String name, int age, String address) {
        // Initializing name, age, and address with specified values
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor to clone another person's attributes
    public Person(Person another) {
        // Cloning name, age, and address from another person
        this.name = another.name;
        this.age = another.age;
        this.address = another.address;
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age attribute
    public int getAge() {
        return age;
    }

    // Setter method for the age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for the address attribute
    public String getAddress() {
        return address;
    }

    // Setter method for the address attribute
    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person details in a readable format
    public void displayPersonDetails() {
        // Printing the person details
        System.out.printf("Name: %s, Age: %d, Address: %s%n", this.name, this.age, this.address);
    }
}

// Creating a class PersonTesting to demonstrate the functionalities of the Person class
public class PersonTesting {
    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person person1 = new Person("John Doe", 30, "123 Main St");

        // Creating a Person object using the copy constructor
        Person person2 = new Person(person1);

        // Displaying details of both persons
        System.out.println("Original Person's Details:");
        person1.displayPersonDetails();
        
        System.out.println("Cloned Person's Details:");
        person2.displayPersonDetails();
    }
}
