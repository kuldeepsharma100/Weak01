import java.util.Scanner;

public class FirstAndSecondLargest {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Store the digits in an Array
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
            if (index == maxDigit) {
                break;  
            }
        }
        
        int largest = 0, secondLargest = 0;
        // Traverse the Array to find Largest and Second Largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Output the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
