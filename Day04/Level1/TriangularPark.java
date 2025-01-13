import java.util.Scanner;

public class TriangularPark {

    // Method to compute the number of rounds
    public static int calculateRounds(double perimeter, double distance) {
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side ");
        double side1 = sc.nextDouble();

        System.out.print("Enter second side ");
        double side2 = sc.nextDouble();

        System.out.print("Enter third side ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double distance = 5000.0;

        // Calculate the number of rounds
        int rounds = calculateRounds(perimeter, distance);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

    }
}
