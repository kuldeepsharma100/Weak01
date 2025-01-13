import java.util.*; // Importing the Scanner class

public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        // Calculating the Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");


    }
}
