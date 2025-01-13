import java.util.Scanner;

public class Distance{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Convert feet to yards and miles
		// 1 yard = 3 feet
		// 1 mile = 1760 yards
		
        double distanceInYards = distanceInFeet / 3; 
        double distanceInMiles = distanceInYards / 1760; 
        
        // Output the results
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

    }
}
