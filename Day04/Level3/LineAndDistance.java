import java.util.Scanner;

public class LineAndDistance {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the equation of the line between two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2]; // [0] will hold slope m, [1] will hold y-intercept b

        // Calculate the slope (m) of the line
        double m = (double)(y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b) of the line
        double b = y1 - m * x1;

        // Store the slope and y-intercept in the array
        equation[0] = m;
        equation[1] = b;

        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the two points: " + distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        // Display the equation of the line
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
