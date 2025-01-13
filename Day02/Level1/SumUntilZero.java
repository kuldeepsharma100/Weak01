import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
		
		//Create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number =sc.nextDouble();
        double total = number;
        
        while (number != 0) {
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
            if (number != 0) {
                total += number;
            }
        }
        
		//Display output
        System.out.println("The total sum is: " + total);
    
    }
}
