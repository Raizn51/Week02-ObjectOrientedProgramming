/*
Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
*/

// Creating a Class Student to manage student details
class Student 
{
    // Declaring public instance variable for roll number
    public int rollNumber;
    
    // Declaring protected instance variable for name
    protected String name;
    
    // Declaring private instance variable for CGPA
    private double CGPA;

    // Parameterized constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber; // Initializing roll number
        this.name = name;             // Initializing name
        this.CGPA = CGPA;             // Initializing CGPA
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.printf("Roll Number: %d, Name: %s, CGPA: %.2f%n", this.rollNumber, this.name, this.CGPA);
    }
}

// Creating a subclass PostgraduateStudent to demonstrate the use of protected members
class PostgraduateStudent extends Student {
    // Declaring additional attribute for PostgraduateStudent
    private String researchTopic;

    // Parameterized constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic)
	{
        // Calling the superclass constructor to initialize inherited attributes
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic; // Initializing research topic
    }

    // Method to display postgraduate student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails(); // Displaying base class details
        System.out.printf("Research Topic: %s%n", this.researchTopic);
    }
}

// Creating a class UniversityManagement to demonstrate the functionalities of Student and PostgraduateStudent classes
class UniversityManagement 
{
    public static void main(String[] args) 
	{
        // Creating a Student object using the parameterized constructor
        Student student1 = new Student(101, "Alice", 3.8);
        
        // Creating a PostgraduateStudent object using the parameterized constructor
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Bob", 3.9, "Artificial Intelligence");

        // Displaying details of the student
        System.out.println("Student Details:");
        student1.displayStudentDetails();
        
        // Modifying and displaying the updated CGPA of the student
        student1.setCGPA(4.0);
        System.out.println("Updated Student Details:");
        student1.displayStudentDetails();

        // Displaying details of the postgraduate student
        System.out.println("Postgraduate Student Details:");
        pgStudent1.displayStudentDetails();
    }
}
