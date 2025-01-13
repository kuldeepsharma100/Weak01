import java.util.Scanner;

public class MaximumHandshakes {

    public static void main(String[] args) {
		//create scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int student = sc.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (student * (student - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);

    }
}
