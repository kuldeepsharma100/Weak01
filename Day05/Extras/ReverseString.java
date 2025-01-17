import java.util.Scanner;

public class ReverseString {
    // method to reverse the string 
    public static String reverseString(String str){
        String rev = "";
        for (int i = 0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        return rev;
    }
    public static void main (String [] args){
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String text = sc.next();

        // calling userdefined reverse method
        String result = reverseString(text);
        // Display the result
        System.out.println(" The reversed String is : " + result);


    }
}