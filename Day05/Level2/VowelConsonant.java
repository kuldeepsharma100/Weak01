import java.util.Scanner;

public class VowelConsonant {

    // Method to check if a character is a vowel, consonant
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
    public static int[] countVowelsAndConsonant(String str) {
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String result = checkCharacter(c);

            if (result.equals("Vowel")) {
                vowel++;
            } else if (result.equals("Consonant")) {
                consonant++;
            }
        }

        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {
		//Create Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonant(str);

        // Display results
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

    }
}
