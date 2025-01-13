import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();
		
		// Array of size 10
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; 
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

    }
}
