import java.util.Scanner;

public class PalindromeChecker {


    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Initialize two pointers, one from the start and one from the end
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // Not a palindrome
            }
            start++;
            end--;
        }
        return true;  // It's a palindrome
    }

    // Function to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Main function to execute the program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check if the input string is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        displayResult(result);
    }
}
