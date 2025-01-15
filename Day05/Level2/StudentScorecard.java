import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(101);// Physics
            scores[i][1] = random.nextInt(101); // Chemistry
            scores[i][2] = random.nextInt(101); // Maths
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("Roll | Physics | Chemistry | Maths | Total | Average | Percentage | Grade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "    " + scores[i][0] + "        " + scores[i][1] + "         " + scores[i][2] + "     " + (int) result[i][0] + "     " + result[i][1] + "       " + result[i][2] + "%         " + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10; // Number of students

        // Generate random scores for PCM
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] result = calculateResult(scores);

        // Calculate grades
        String[] grades = calculateGrades(result);

        // Display the scorecard
        displayScorecard(scores, result, grades);
    }
}
