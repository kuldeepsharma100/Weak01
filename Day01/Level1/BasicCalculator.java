import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        double number1, number2;

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        
        // arithmetic operations
		
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;
        
        // Handle division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not possible.");
        }
        
        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + " is:" + addition + " " + subtraction + " " + multiplication + " and " + division);
      

    }
}
