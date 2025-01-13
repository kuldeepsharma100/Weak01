import java.util.Scanner;

public class CheckNumber {

    // Method to check whether a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; 
        } else if (number < 0) {
            return -1; 
       } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check the number and get the result
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
