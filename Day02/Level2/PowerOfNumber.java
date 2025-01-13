import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        // Get the number and power input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize  variable
        int result = 1;

        // Loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

    }
}
