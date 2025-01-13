import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Perform  operations
        int result1 = a + b * c;  
        int result2 = a * b + c; 
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

    }
}
