import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize greatestFactor 
        int greatestFactor = 1;

        // Loop from number-1 to 1 
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

    }
}
