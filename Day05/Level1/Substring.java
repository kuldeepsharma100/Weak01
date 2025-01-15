import java.util.Scanner;

public class Substring {

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String substring = "";
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        String substringCharAt = substringUsingCharAt(str, start, end);

        String substringBuiltIn = str.substring(start, end);

        boolean comparisonResult = compareUsingCharAt(substringCharAt, substringBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("Comparison result: " + (comparisonResult ? "Match" : "Do not match"));

        sc.close();
    }
}
