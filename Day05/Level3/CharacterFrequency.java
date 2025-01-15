import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }

        // Count unique characters to create result array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(str);

        // Display the frequencies
        System.out.println("Character | Frequency");
        System.out.println("-----------------------");
        for (String[] entry : frequencies) {
            System.out.println("     " + entry[0] + "      |     " + entry[1]);
        }
    }
}
