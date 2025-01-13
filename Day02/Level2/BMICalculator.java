import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Input weight in kg and height in cm
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        
        // Convert height to meters
        double heightMeters = heightCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);
        
        // Determine BMI status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display results
        System.out.println("BMI:" + bmi);
        System.out.println("Status: " + status);

    }
}