import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
	
        // Initialize the scanner and take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        // Initialize the count variable
        int count = 0;
        
       
        if (number == 0) {
            count = 1;
        } else {
            // Loop to remove the last digit and count the digits
            while (number != 0) {
                number /= 10; 
                count++;
            }
        }
        
        // Display the count of digits
        System.out.println("Number of digits: " + count);

    }
}
