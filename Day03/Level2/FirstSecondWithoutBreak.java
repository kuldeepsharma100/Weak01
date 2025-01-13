import java.util.Scanner;

public class FirstSecondWithoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
        
        int maxDigit = 10;  
        int index = 0;      
        int[] digits = new int[maxDigit]; 
        
        while (number > 0) {
            int digit = (int)(number % 10);
            digits[index] = digit;
            number = number / 10;
            index++;
            
            if (index == maxDigit) {
                maxDigit += 10; 
                int[] temp = new int[maxDigit];
                
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                digits = temp;  
            }
        }
        
        int largest = 0;
        int secondLargest = 0;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
