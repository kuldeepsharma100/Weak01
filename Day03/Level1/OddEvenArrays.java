import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
	
		//Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
		
		//Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number ");
            return;
        }

        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
				evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
				oddIndex++;
            }
        }
		
		//Print odd Array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
