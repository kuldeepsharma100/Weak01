import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop to find and print the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
