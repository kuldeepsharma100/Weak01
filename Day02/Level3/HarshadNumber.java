import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
	
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;
        int temp = number;


        while (temp != 0) {
            sum += temp % 10; 
            temp /= 10; 
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

    }
}
