import java.util.Scanner;

public class TrimString {

    // Method to find start and end indices without spaces
    public static int[] findIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the start index
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Find the end index
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }


    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
		//Create scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String str = sc.nextLine();

        // Find trim indices
        int[] trimIndices = findIndices(str);
        int start = trimIndices[0];
        int end = trimIndices[1];

        // Trim the string using custom method
        String trimmedCustom = (start <= end) ? createSubstring(str, start, end) : "";

        // Trim the string using built-in trim() method
        String trimmedBuiltIn = str.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display the results
        System.out.println("String after custom trimming: '" + trimmedCustom + "'");
        System.out.println("String after built-in trimming: '" + trimmedBuiltIn + "'");
        System.out.println("Are both results the same? " + isSame);

    }
}
