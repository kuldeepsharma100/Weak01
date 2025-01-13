import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
		//create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            int sumUsingFormula = number * (number + 1) / 2;
            int sumUsingLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumUsingLoop += i;
            }
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using for loop: " + sumUsingLoop);
			System.out.println("Result after comparing  " + (sumUsingLoop == sumUsingFormula));
        } else {
            System.out.println("Invalid input. Please enter a natural number.");
        }

    }
}
