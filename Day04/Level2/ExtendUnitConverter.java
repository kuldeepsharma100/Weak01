import java.util.Scanner;

public class ExtendUnitConverter {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; 
        return yards * yards2feet;
    }

       // Method to convert feet to yards
        public static double convertFeetToYards(double feet) {
          double feet2yards = 0.333333; 
         return feet * feet2yards;
    } 

    // Method to convert meters to inches
      public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; 
          return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; 
        return inches * inches2meters;
     }

    // Method to convert inches to centimeters
      public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
          return inches * inches2cm;
           }

    public static void main(String[] args) {
		//Create the scanner object
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter a value in yards: ");
         double yards = sc.nextDouble();
          double feetFromYards = convertYardsToFeet(yards);
          System.out.println(yards + " yards = " + feetFromYards + " feet");

        System.out.print("Enter a value in feet: ");
        double feet = sc.nextDouble();
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet = " + yardsFromFeet + " yards");

         System.out.print("Enter a value in meters: ");
         double meters = sc.nextDouble();
         double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meters = " + inchesFromMeters + " inches");

        System.out.print("Enter a value in inches: ");
        double inches = sc.nextDouble();
         double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches = " + metersFromInches + " meters");

        System.out.print("Enter a value in inches ");
        double inchesForCm = sc.nextDouble();
        double cmFromInches = convertInchesToCentimeters(inchesForCm);
        System.out.println(inchesForCm + " inches = " + cmFromInches + " centimeters");

         }
        }
