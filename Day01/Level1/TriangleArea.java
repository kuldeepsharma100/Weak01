import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();
        
        //  area in square inches
        double areaInInches = 0.5 * base * height;
        
        // Area in cm square
        double areaInCm = areaInInches * 2.54 * 2.54;
        
        // Display the results
        System.out.println("The area of the triangle in square inches is: " + areaInInches);
        System.out.println("The area of the triangle in square centimeters is: " + areaInCm);

    }
}
