import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the conversion result
    public static void displayResult(String conversionType, double input, double result) {
        System.out.println(input + " " + conversionType + " is equal to: " + result);
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Asking user to choose conversion type
        System.out.println("Temperature Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Fahrenheit to Celsius conversion
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult("Fahrenheit", fahrenheit, celsius);
        } else if (choice == 2) {
            // Celsius to Fahrenheit conversion
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult("Celsius", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
    }
}
