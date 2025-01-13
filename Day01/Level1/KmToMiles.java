import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        //  km variable as double
        double km;
        
        // Take user input for kilometers
        km = sc.nextDouble();
        
        // Convert kilometers to miles 
        double miles = km / 1.6;
        
        // Display the output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

    }
}
