import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate the number of digits in the number
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Check if the number is an Armstrong number
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        // Display the result
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
