import java.util.Scanner;

public class CharacterFrequency1 {
    
    // Method to find frequency of characters and return them in a 1D array
    public static String[] findFrequency(String str) {

        char[] characters = str.toCharArray();
        
        int[] frequency = new int[characters.length];
        
        String[] result = new String[characters.length];
        
        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            // Skip if character is already counted
            if (characters[i] == '0') {
                continue;
            }
            
            // Initialize frequency for this character
            frequency[i] = 1;
            
            // Inner loop to find duplicates and increment frequency
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';  // Mark duplicate as counted
                }
            }
            
            // Store the character and its frequency in result array
            result[i] = characters[i] + " : " + frequency[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner object 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        String[] frequencies = findFrequency(str);
        
        // Display the result
        System.out.println("Character frequencies:");
        for (String str1 : frequencies) {
            if (str1 != null) {
                System.out.println(str1);
            }
        }
        
        sc.close();
    }
}
