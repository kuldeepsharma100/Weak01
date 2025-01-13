import java.util.Scanner;

public class PoundToKilogram{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weight = sc.nextDouble();

        // Convert weight to kilograms
        double weightInKg = weight * 2.2;

        // Output the result
        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + weightInKg);

    }
}
