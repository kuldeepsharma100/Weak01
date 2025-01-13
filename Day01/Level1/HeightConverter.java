import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        //  Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();
        
        //  centimeters to inches
        double heightInInches = heightInCm / 2.54;
        
        //  inches to feet
        int feet = (int) heightInInches / 12;
        
        // Display the result
        System.out.println("Your height in cm is " + heightInCm + " while in feet it is " + feet + " feet and " + heightInInches + " inches.");

    }
}
