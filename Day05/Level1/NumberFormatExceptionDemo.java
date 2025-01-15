import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Attempting to convert text to number...");
        int number = Integer.parseInt(text); 
    }

    // Method to handle NumberFormatException and other runtime exceptions
    public static void handleException(String text) {
        try {
            generateException(text); 
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to convert to a number: ");
        String userInput = sc.nextLine();

        handleException(userInput);
    }
}
