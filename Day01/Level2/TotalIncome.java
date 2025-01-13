import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
 

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for salary
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Take user input for bonus
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        // Compute total income 
        double totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

    }
}
