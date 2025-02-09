import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int terms) {
        // Starting values for the Fibonacci sequence
        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        // Print the Fibonacci sequence
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            // Calculate the next term in the sequence
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();  
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();

        // Call the function to print the Fibonacci sequence
        printFibonacci(terms);
    }
}
