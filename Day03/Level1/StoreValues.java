import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {

        double[] numbers = new double[10];
		// Initialize total and index variable
        double total = 0.0; 
        int index = 0;  
		
		// Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // Break the loop if the input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if the array is full
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            numbers[index] = input;
            index++;
        }

        // Calculate the total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }


        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total
        System.out.println("Total sum of numbers: " + total);

    }
}
