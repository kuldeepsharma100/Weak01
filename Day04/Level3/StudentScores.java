import java.util.Random;

public class StudentScores {

    // Method to generate random marks for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 2D array for marks (Physics, Chemistry, Math)

        Random rand = new Random();

        // Generate random marks (2-digit score between 50 and 100)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50;  // Physics marks
            scores[i][1] = rand.nextInt(51) + 50;  // Chemistry marks
            scores[i][2] = rand.nextInt(51) + 50;  // Math marks
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores, int numStudents) {
		// 2D array to store total, average, percentage, and grade
        double[][] results = new double[numStudents][4]; 

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100; 

            // Round values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;

            // Assign grade based on percentage
            if (results[i][2] >= 80) {
                results[i][3] = 'A'; 
            } else if (results[i][2] >= 70) {
                results[i][3] = 'B'; 
            } else if (results[i][2] >= 60) {
                results[i][3] = 'C';  
            } else if (results[i][2] >= 50) {
                results[i][3] = 'D';
            } else if (results[i][2] >= 40) {
                results[i][3] = 'E';  
            } else {
                results[i][3] = 'R';  
            }
        }

        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " | " + scores[i][0] + " | " + scores[i][1] + " | " + scores[i][2] + " | " 
                    + results[i][0] + " | " + results[i][1] + " | " + results[i][2] + " | " + (char) results[i][3]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; 

        int[][] scores = generateScores(numStudents);

        // Calculate the total, average, percentage, and grade for each student
        double[][] results = calculateResults(scores, numStudents);

        // Display the scorecard
        displayScorecard(scores, results, numStudents);
    }
}
