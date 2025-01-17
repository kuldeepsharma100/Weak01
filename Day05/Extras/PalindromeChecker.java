import java.util.Scanner;

public class PalindromeChecker {
    // Method to check palindrome string
    public static boolean checkPalindrome(String str){
        for(int i = 0, j= str.length()-1; i<=j; i++, j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String text = sc.next();
        //Display the result
        System.out.println("The String is palindrome : "+ checkPalindrome(text));
    }
}
