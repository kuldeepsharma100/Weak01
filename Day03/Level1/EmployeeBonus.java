import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numEmployees = 10;
        
        double[] oldSalary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        for (int i = 0; i < numEmployees; i++) {

            for (int attempt = 0; attempt < 3; attempt++) { 
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                oldSalary[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                
                if (oldSalary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. ");
                    if (attempt == 2) {
                        System.out.println("Maximum attempts reached ");
                   }
                } else {
                    break; 
           }
            }
    }
        
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05;  
            } else {
                bonus[i] = oldSalary[i] * 0.02;  
   }
            
            newSalary[i] = oldSalary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];  
            totalNewSalary += newSalary[i];   }
        
        // Print total bonus, old salary, and new salary of  employees
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
    }
}
