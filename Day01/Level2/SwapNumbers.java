import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 ");
        int number1 = sc.nextInt();

        System.out.print("Enter number2 ");
        int number2 = sc.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

    }
}
