import java.util.Scanner;

public class Handshake {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
		//Scanner onject for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int maxHandshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);
        }

    }
}
