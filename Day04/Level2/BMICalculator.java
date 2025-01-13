import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
			// Convert height from cm to meters
            double heightInMeters = data[i][1] / 100.0;  
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); 
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 10 rows for 10 members, 3 columns for weight, height, and BMI
        double[][] data = new double[10][3];  

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Display height, weight, BMI, and status
        System.out.println("\nHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);
			System.out.println(data[i][1] + "\t\t" + data[i][0] + "\t\t" + bmi + "\t" + status);

        }

    }
}