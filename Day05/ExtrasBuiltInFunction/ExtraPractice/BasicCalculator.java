import java.util.Scanner;

public class BasicCalculator {

    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0.0;
        }
        return num1 / num2;
    }


    // Function to display the result
    public static void displayResult(String operation, double result) {
        System.out.println("The result of the operation is: " + result);
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to choose an operation
        System.out.println("Basic Calculator:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Get user input for numbers
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double result = 0;

        // Perform the selected operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                return; // Exit the program if the choice is invalid
        }

        // Display the result
        displayResult("Operation", result);
    }
}
