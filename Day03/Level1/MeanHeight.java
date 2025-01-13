import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
	
	    // Create Scanner Object
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11]; 
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players :");

        // Input heights and calculate the sum
        for (int i = 0; i < height.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            sum += height[i];
        }

        // Calculate the mean
        double mean = sum / height.length;

        // Display the result
        System.out.println("The mean height of the football team is: " +  mean);

    }
}
