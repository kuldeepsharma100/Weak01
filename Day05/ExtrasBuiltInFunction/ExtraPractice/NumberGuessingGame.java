import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate a random guess
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1);  // Random guess between low and high
    }

    // Function to get user feedback
    public static String getFeedback() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the guess correct? (yes/no). If not, is the guess too high or too low?");
        String feedback = sc.nextLine().toLowerCase();
        return feedback;
    }

    // Function to play the game
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");

        while (true) {
            guess = generateGuess(low, high);  // Generate a guess
            System.out.println("My guess is: " + guess);
            feedback = getFeedback();  // Get feedback from the user

            if (feedback.equals("yes")) {
                System.out.println("Yay! I guessed it right.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;  // If the guess is too high, adjust the high range
            } else if (feedback.equals("low")) {
                low = guess + 1;  // If the guess is too low, adjust the low range
            } else {
                System.out.println("Invalid feedback. Please respond with 'high', 'low', or 'yes'.");
            }
        }
    }

    public static void main(String[] args) {
        playGame();  // Start the game
    }
}
