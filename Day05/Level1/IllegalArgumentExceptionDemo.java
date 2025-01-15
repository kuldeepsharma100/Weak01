import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {

        System.out.println("Attempting to get a substring...");
        String result = str.substring(5, 2); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle IllegalArgumentException 
    public static void handleException(String str) {
        try {
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call method to handle exceptions
        handleException(userInput);

    }
}
