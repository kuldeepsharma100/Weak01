import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(int a, int b, int c) {
		
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        else {
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
		//Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        int a = sc.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = sc.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = sc.nextInt();

        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

    }
}
