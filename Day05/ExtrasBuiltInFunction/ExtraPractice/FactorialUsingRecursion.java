import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive function to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main function to execute the program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
 
        // Calculate the factorial using recursion
        int factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }
}
