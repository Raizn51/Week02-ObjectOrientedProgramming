/*
Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
*/

// Creating a class Student to manage student data and their functionalities
class Student 
{
    // Static variable to store the university name shared by all students
    private static String universityName = "Gourav University";

    // Static variable to keep track of the total number of students
    private static int totalStudents = 0;

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students enrolled: " + totalStudents);
    }

    // Declaring private attributes for the Student class
    private String name;
    private final int rollNumber; // Final variable to ensure the roll number cannot be changed
    private String grade;

    // Constructor to initialize student details with provided values
    public Student(String name, int rollNumber, String grade) 
	{
        // Using 'this' keyword to resolve ambiguity
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Incrementing the total number of students
    }

    // Getter method for the name attribute
    public String getName() {
        return name;
    }

    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the rollNumber attribute
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter method for the grade attribute
    public String getGrade() {
        return grade;
    }

    // Setter method for the grade attribute
    public void setGrade(String grade) 
	{
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() 
	{
        // Checking if the student object is an instance of the Student class
        if (this instanceof Student) 
		{
            System.out.printf("Name: %s, Roll Number: %d, Grade: %s%n", this.name, this.rollNumber, this.grade);
        } 
		else 
		{
            System.out.println("Invalid student object.");
        }
    }
}

// Creating a class UniversityManagement to demonstrate the functionalities of the Student class
class UniversityManagement 
{
    public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			
			// Creating Student objects using the constructor
			Student student1 = new Student(Character.toString((char)97+i), 101+i, Character.toString((char)65+i));
			// Displaying student details
			student1.displayStudentDetails();	
		}
		// Displaying the total number of students
		Student.displayTotalStudents();
    }
}

