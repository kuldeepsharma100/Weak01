import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num > 0) {
            // Initialize  variable
            int i = 1;

            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
                // Increment 
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

    }
}
