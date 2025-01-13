import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for principal, rate, and time
        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();

        System.out.print("Enter the time period in years: ");
        int time = sc.nextInt();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100.0;

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                           ", Rate of Interest " + rate + " and Time " + time);

    }
}
