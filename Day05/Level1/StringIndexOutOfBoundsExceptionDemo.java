import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Attempting to access an invalid index
        System.out.println("Character at position 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Attempting to access an invalid index
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Generate StringIndexOutOfBoundsException
        System.out.println("Demonstrating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Handle StringIndexOutOfBoundsException
        System.out.println("Handling StringIndexOutOfBoundsException:");
        handleException(text);

    }
}
