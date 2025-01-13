import java.util.Scanner;

public class TrigonometryFunction {

      public static double[] function(double angle) {

		  double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
		
		// Create Scanner onject
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = function(angle);

        // Display the results
        System.out.println("Sine of " + angle + "°:  " + results[0]);
        System.out.println("Cosine of " + angle + "°:  " + results[1]);
        System.out.println("Tangent of " + angle + "°:  " + results[2]);

    }
}
