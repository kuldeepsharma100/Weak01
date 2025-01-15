import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiData = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
          // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100.0; 
            double bmi = Math.round((weight / (heightInMeters * heightInMeters)) * 100.0) / 100.0;

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

            bmiData[i][0] = String.valueOf(data[i][0]); // Weight
            bmiData[i][1] = String.valueOf(data[i][1]); // Height
            bmiData[i][2] = String.valueOf(bmi); // BMI
            bmiData[i][3] = status; // Status
        }

        return bmiData;
    }

    // Method to display the BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("Person | Weight (kg) | Height (cm) | BMI  | Status");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println((i + 1) + "       " + bmiData[i][0] + "           " + bmiData[i][1] + "           " + bmiData[i][2] + "   " + bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = calculateBMI(data);

        // Display the BMI data
        displayBMIData(bmiData);
    }
}
