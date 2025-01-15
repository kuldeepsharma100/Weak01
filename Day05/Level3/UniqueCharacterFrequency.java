import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already added to uniqueChars
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to fit the exact uniqueCount
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of unique characters
    public static String[][] findCharacterFrequency(String str) {
        char[] uniqueChars = findUniqueCharacters(str);
        int[] frequency = new int[uniqueChars.length];

        // Calculate frequency of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (uniqueChars[i] == str.charAt(j)) {
                    frequency[i]++;
                }
            }
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Find the frequency of unique characters
        String[][] frequencies = findCharacterFrequency(str);

        // Display the frequencies
        System.out.println("Character | Frequency");
        System.out.println("-----------------------");
        for (String[] entry : frequencies) {
            System.out.println("     " + entry[0] + "      |     " + entry[1]);
        }
    }
}
