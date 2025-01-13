import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1, 0, or -1
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; 
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store the 5 numbers
        int[] numbers = new int[5];

        // Input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            String result = isPositive(numbers[i]);
            System.out.println("Number " + (i + 1) + " is " + result);

            if (result.equals("Positive")) {
                System.out.println("Number " + (i + 1) + " is " + isEven(numbers[i]));
            }
        }

        // Compare the first and last element of the array
        int comparisonResult = compare(numbers[0], numbers[4]);

        // Display the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

    }
}
