import java.util.Scanner;

public class StringComparison {

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
		  // Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.next();

        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);

        boolean equalsResult = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Check if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

    }
}
