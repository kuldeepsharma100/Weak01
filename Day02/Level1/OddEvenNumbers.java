import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
		
		// Create Scanner object
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
		//check weather the number is valid or not 
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a natural number.");
        }

    }
}
