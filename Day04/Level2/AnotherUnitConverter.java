import java.util.Scanner;

public class AnotherUnitConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9; 
        return fahrenheit2celsius;
    }


    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; 
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

     public static void main(String[] args) {
		 
		 // Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value in Fahrenheit: ");
         double fahrenheit = sc.nextDouble();
         double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit = " + celsiusFromFahrenheit + " Celsius");

        System.out.print("Enter a value in Celsius: ");
        double celsius = sc.nextDouble();
         double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
         System.out.println(celsius + " Celsius = " + fahrenheitFromCelsius + " Fahrenheit");

        System.out.print("Enter a value in pounds: ");
        double pounds = sc.nextDouble();
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds = " + kilogramsFromPounds + " kilograms");
  
          System.out.print("Enter a value in kilograms: ");
        double kilograms = sc.nextDouble();
         double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms = " + poundsFromKilograms + " pounds");

        System.out.print("Enter a value in gallons: ");
        double gallons = sc.nextDouble();
          double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons = " + litersFromGallons + " liters");

        System.out.print("Enter a value in liters: ");
         double liters = sc.nextDouble();
         double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters = " + gallonsFromLiters + " gallons");

    }
}
