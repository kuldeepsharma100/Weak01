import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
			 // Generates a random age between 10 and 99
            ages[i] = random.nextInt(90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age  Eligibility");
        System.out.println("-------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "   " + row[1]);
        }
    }

    public static void main(String[] args) {
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display the results
        displayResults(results);

        sc.close();
    }
}
