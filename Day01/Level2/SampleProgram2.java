import java.util.Scanner;

public class SampleProgram2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the city you are traveling to: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance fromToVia ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance viaToFinalCity ");
        double viaToFinalCity = sc.nextDouble();

        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;

        System.out.print("Enter the total time taken ");
        double timeTaken = sc.nextDouble();

        // Output the result
        System.out.println("\nJourney Details:");
        System.out.println("Name " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");

    }
}
