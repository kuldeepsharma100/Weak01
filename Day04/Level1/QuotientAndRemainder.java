import java.util.Scanner;

public class QuotientRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderQuotient(int number, int divisor) {
		
		
        // Calculate quotient and remainder
        int quotient = number / divisor;
        int remainder = number % divisor;

            return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
		
		// Create the Scanner object
         Scanner sc = new Scanner(System.in);

          System.out.print("Enter the dividend  ");
           int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Ensure divisor is not zero
        if (divisor == 0) {
            System.out.println(" Divisor cannot be zero.");
        } else {

            int[] result = findRemainderQuotient(number, divisor);

            // Display the quotient and remainder
             System.out.println("The quotient is: " + result[0]);
             System.out.println("The remainder is: " + result[1]);
        }

    }
}
