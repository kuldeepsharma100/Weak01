import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
		//Create Scanner Object
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
		
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than or equal to 5 years of service.");
        }

    }
}
