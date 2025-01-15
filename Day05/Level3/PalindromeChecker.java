import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Method to check palindrome by comparing characters from start and end
    public static boolean isPalindromeByIndex(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  
            }
            start++;
            end--;
        }
        return true;  
    }

    // Logic 2: Recursive method to check palindrome by comparing characters from start and end
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;  
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;  
        }
        return isPalindromeRecursive(text, start + 1, end - 1);  
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeByCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];

        // Reverse the string using charAt()
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text ");
        String inputText = sc.nextLine();

        boolean result1 = isPalindromeByIndex(inputText);
        boolean result2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean result3 = isPalindromeByCharArray(inputText);

        // Display the results
        System.out.println("Palindrome check using Index Method: " + result1);
        System.out.println("Palindrome check using Recursive Method: " + result2);
        System.out.println("Palindrome check using Character Array Method: " + result3);

        sc.close();
    }
}
