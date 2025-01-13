import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive Method 
    public static int sumRecursive(int n) {
			// Base condition
        if (n == 1) {
            return 1;
        }
		// recusive call
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
		// Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return; \
        }

        int recursiveSum = sumRecursive(n);

        int formulaSum = sumFormula(n);

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers using the formula: " + formulaSum);

        // Compare the results 
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }

    }
}
