import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take user input for Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: (Fahrenheit - 32) * 5/9
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

    }
}
