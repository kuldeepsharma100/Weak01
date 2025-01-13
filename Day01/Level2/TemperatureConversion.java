import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit 
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    }
}
