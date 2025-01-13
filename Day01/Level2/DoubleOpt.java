import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
		
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Perform the specified double operations
        double result1 = a + b * c;  
        double result2 = a * b + c; 
        double result3 = c + a / b; 
        double result4 = a % b + c; 
		
        // Output the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

    }
}
