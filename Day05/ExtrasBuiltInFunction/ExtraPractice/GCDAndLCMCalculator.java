import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Function to calculate the GCD (Greatest Common Divisor) using Euclid's algorithm
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;  // The GCD
    }

    // Function to calculate the LCM (Least Common Multiple) using the formula:
    // LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;  // Formula to calculate LCM
    }

    // Function to display the results
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Main function to execute the program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // Calculate the GCD
        int gcd = calculateGCD(num1, num2);
        
        // Calculate the LCM using the formula
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Display the results
        displayResults(num1, num2, gcd, lcm);
    }
}
