import java.util.Scanner;

public class UppercaseConversion {

    // Method to convert each character to uppercase using ASCII value difference
    public static String convertToUpperCase(String text) {
        String upperCaseText = "";
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase to uppercase by adjusting ASCII values
                char upperChar = (char) (currentChar - 32);
                upperCaseText += upperChar; 
            } else {
                upperCaseText += currentChar; 
            }
        }
        
        return upperCaseText;
    }

    // Method to compare two strings using charAt() method and return boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings with different lengths cannot be equal
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String Input = sc.nextLine();

        // Convert the text to uppercase using the user-defined method
        String convertedText = convertToUpperCase(Input);

        // Use built-in String method to convert text to uppercase
        String builtInUpperCase = Input.toUpperCase();

        // Compare both strings using the user-defined compareStrings method
        boolean areEqual = compareStrings(convertedText, builtInUpperCase);

        // Display the result
        System.out.println("Original Text: " + Input);
        System.out.println("Uppercase Text (Custom Method): " + convertedText);
        System.out.println("Uppercase Text (Built-in Method): " + builtInUpperCase);
        System.out.println("Are both strings equal? " + (areEqual ? "Yes" : "No"));

    }
}
