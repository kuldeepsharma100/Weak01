import java.util.Scanner;
import java.util.Arrays;

public class StringToArray {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        char[] char1 = getCharacters(str);

        char[] char2 = str.toCharArray();

        // Compare the two arrays
        boolean Result = compareCharArrays(char1, char2);

        // Display the results
        System.out.println("Characters from user-defined method: " + Arrays.toString(char1));
        System.out.println("Characters from toCharArray() method: " + Arrays.toString(char2));
        System.out.println("Comparison result: " + (Result ? "Match" : "Do not match"));

    }
}
