import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // A prime number is greater than 1 and divisible only by 1 and itself
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
