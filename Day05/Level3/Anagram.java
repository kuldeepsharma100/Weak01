import java.util.Scanner;

public class Anagram {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        // Arrays to store the frequency of characters in both texts
        int[] frequency1 = new int[256];  
        int[] frequency2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;  
            frequency2[str2.charAt(i)]++;  
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second text:");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
