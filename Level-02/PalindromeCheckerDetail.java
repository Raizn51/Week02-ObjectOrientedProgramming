/*
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an 
attribute text. 
Add methods to:
	Check if the text is a palindrome.
	Display the result.
Explanation: The PalindromeChecker class holds the text 
attribute. The methods operate on this attribute to verify 
its palindrome status and display the result.
*/

// This class represents a palindrome checker with an attribute text
class PalindromeChecker 
{
    // Attribute to store the text to be checked
    private String text;

    // Constructor to initialize the PalindromeChecker object with text
    public PalindromeChecker(String text) {
        this.text = text; // Assigning the text to the palindrome checker
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0; // Initialize the left index
        int right = text.length() - 1; // Initialize the right index

        // Loop to compare characters from both ends
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            // Check if characters at left and right indices are equal (case insensitive)
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false; // Return false if characters do not match
            }

            // Move towards the center
            left++;
            right--;
        }

        return true; // Return true if the text is a palindrome
    }

    // Method to display the result
    public void displayResult() {
        // Check if the text is a palindrome and display the result
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
// This class contains the main method to create and check palindrome status of text
class PalindromeCheckerDetail 
{
    public static void main(String[] args) 
	{
        // Creating PalindromeChecker objects with predefined text
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal, Panama");
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        PalindromeChecker checker3 = new PalindromeChecker("madam");
        PalindromeChecker checker4 = new PalindromeChecker("No lemon, no melon");

        // Displaying the result of palindrome check for each text
        System.out.println("=== Palindrome Check 1 ===");
        checker1.displayResult(); // Displaying result of checker 1

        System.out.println("\n=== Palindrome Check 2 ===");
        checker2.displayResult(); // Displaying result of checker 2

        System.out.println("\n=== Palindrome Check 3 ===");
        checker3.displayResult(); // Displaying result of checker 3

        System.out.println("\n=== Palindrome Check 4 ===");
        checker4.displayResult(); // Displaying result of checker 4
    }
}

