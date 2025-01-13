import java.util.Scanner;

public class WindChill {

    // Method to calculate the wind chill 
    public static double calculateWindChill(double temperature, double windSpeed) {
        
		 // Using the wind chill formula
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
           return windChill;
    }

    public static void main(String[] args) {
		
		
		// Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

          System.out.print("Enter the wind speed: ");
        double windSpeed = sc.nextDouble();

            // Calculate the wind chill
             double windChill = calculateWindChill(temperature, windSpeed);
            
           // Display the result
             System.out.println("The wind chill temperature is: " + windChill);

    }
}
