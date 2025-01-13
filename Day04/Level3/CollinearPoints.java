import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes of AB, BC, and AC
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        // Check if slopes are equal
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {
		
		// Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for three points
        System.out.print("Enter x1: ");
         int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();

         System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

         System.out.print("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y3: ");
         int y3 = scanner.nextInt();

        // Check if points are collinear using the slope formula
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
         System.out.println("Are points collinear by slope formula? " + collinearBySlope);

        // Check if points are collinear using the area formula
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
         System.out.println("Are points collinear by area formula? " + collinearByArea);
    }
}
