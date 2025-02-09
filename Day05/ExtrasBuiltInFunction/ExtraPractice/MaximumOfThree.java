import java.util.Scanner;

public class MaximumOfThree {

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 =sc.nextInt();
        
        // Finding and displaying the maximum value
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum value is: " + max);
    }
}
