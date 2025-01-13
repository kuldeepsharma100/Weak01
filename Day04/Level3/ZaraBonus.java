import java.util.Random;

public class ZaraBonus {

    // Method to determine the salary and years of service for each employee
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];

        Random rand = new Random();
        
        for (int i = 0; i < numEmployees; i++) {
			//salary
            data[i][0] = rand.nextInt(90000) + 10000;
			//year of service 
            data[i][1] = rand.nextInt(15) + 1;
        }
        
        return data;
    }

    // Method to calculate the new salary and bonus based on the years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] data, int numEmployees) {
        double[][] result = new double[numEmployees][3]; 

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = data[i][0];
            int yearsOfService = data[i][1];

            // Calculate the bonus based on the years of service
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;

            // Calculate the new salary
            double newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus
            result[i][0] = oldSalary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }

        return result;
    }

    // Method to calculate and display the sum of old salaries, new salaries, and total bonuses
    public static void calculateAndDisplaySalaries(double[][] data, int numEmployees) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        // Calculate the sum of old salary, new salary, and total bonus
        for (int i = 0; i < numEmployees; i++) {
            sumOldSalary += data[i][0];
            sumNewSalary += data[i][1];
            totalBonus += data[i][2];
        }

         // Display the header for the table
        System.out.println("Employee | Old Salary  | New Salary  | Bonus");
        System.out.println("-------------------------------------------------");

        // Display the details of each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println((i + 1) + "         " + data[i][0] + "     " + data[i][1] + "     " + data[i][2]);
        }

        // Display the total amounts
        System.out.println("\nTotal Old Salary: " + sumOldSalary);
        System.out.println("Total New Salary: " + sumNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees
        int[][] employeeData = generateEmployeeData(numEmployees); 

        double[][] salaryData = calculateNewSalaryAndBonus(employeeData, numEmployees); 

        // Display the results
        calculateAndDisplaySalaries(salaryData, numEmployees);
    }
}
