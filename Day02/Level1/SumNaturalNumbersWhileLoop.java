import java.util.Scanner;

public class SumNaturalNumbersWhileLoop {
    public static void main(String[] args) {
		//Create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            int sumUsingFormula = number * (number + 1) / 2;
            int sumUsingLoop = 0;
            int i = 1;
            while (i <= number) {
                sumUsingLoop += i;
                i++;
            }
			
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);
			System.out.println("Result after comparing  " + (sumUsingLoop == sumUsingFormula));
        } else {
            System.out.println("Invalid input. Please enter a natural number.");
        }
 
    }
}
