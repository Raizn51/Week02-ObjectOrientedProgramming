/*
Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
*/

// Creating a Class Course to manage course details and institute name
class Course
 {
    // Declaring instance variables for the Course class
    private String courseName;
    private int duration; // Duration in hours
    private double fee;

    // Class variable for the institute name, shared among all instances
    private static String instituteName = "Unknown Institute";

    // Parameterized constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName; // Initializing course name
        this.duration = duration;     // Initializing duration
        this.fee = fee;               // Initializing fee
    }

    // Getter method for the course name
    public String getCourseName() {
        return courseName;
    }

    // Setter method for the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName; // Setting course name
    }

    // Getter method for the duration
    public int getDuration() {
        return duration;
    }

    // Setter method for the duration
    public void setDuration(int duration) {
        this.duration = duration; // Setting duration
    }

    // Getter method for the fee
    public double getFee() {
        return fee;
    }

    // Setter method for the fee
    public void setFee(double fee) {
        this.fee = fee; // Setting fee
    }

    // Instance method to display the details of a course
    public void displayCourseDetails() {
        // Displaying course details
        System.out.printf("Course Name: %s, Duration: %d hours, Fee: %.2f, Institute Name: %s%n", this.courseName, this.duration, this.fee, Course.instituteName);
		System.out.println(":::::::::::::::::::::::::::");
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        Course.instituteName = newInstituteName; // Setting new institute name
    }
}

// Creating a class CourseTesting to demonstrate the functionalities of the Course class
class CourseTesting {
    public static void main(String[] args) {
        // Updating the institute name
        Course.updateInstituteName("Tech Academy");

        // Creating course instances using parameterized constructor
        Course course1 = new Course("Java Programming", 40, 300.0);
        Course course2 = new Course("Data Science", 60, 400.0);

        // Displaying initial course details using displayCourseDetails() method
        System.out.println("Initial Course 1 Details:");
        course1.displayCourseDetails();
        
        System.out.println("Initial Course 2 Details:");
        course2.displayCourseDetails();

        // Updating course attributes using setter methods
        course1.setCourseName("Advanced Java Programming");
        course1.setDuration(50);
        course1.setFee(350.0);

        course2.setCourseName("Machine Learning");
        course2.setDuration(70);
        course2.setFee(500.0);

        // Displaying updated course details using displayCourseDetails() method
        System.out.println("Updated Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("Updated Course 2 Details:");
        course2.displayCourseDetails();

        // Displaying the updated institute name
        Course.updateInstituteName("Elite Tech Academy");
        System.out.println("Updated Institute Name for all courses:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
