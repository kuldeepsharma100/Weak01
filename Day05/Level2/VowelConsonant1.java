import java.util.Scanner;

public class VowelConsonant1 {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char c) {
        // Convert character to lowercase
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        // Check for vowels
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }

        // Check for consonants
        if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }

        // Not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] analyzeString(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacter(c);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void display2DArray(String[][] result) {
        System.out.println("Character  Type");
        System.out.println("---------------------------");

        for (String[] row : result) {
            System.out.println(row[0] + "          " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Analyze the string
        String[][] result = analyzeString(str);

        // Display the analysis
        display2DArray(result);

    }
}
