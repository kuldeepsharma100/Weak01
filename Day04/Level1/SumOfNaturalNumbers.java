import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using a loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();


        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum
            int sum = calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

    }
}
