import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] reversed = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            reversed[i] = temp % 10;
            temp /= 10;
        }



        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }


    }
}
