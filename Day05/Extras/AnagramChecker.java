import java.util.Scanner;

public class AnagramChecker {
    // create method to check anagram
    public static boolean isAnagram(String text1, String text2){
        int frequency1 [] = new int[256];
        int frequency2 [] = new int[256];
        if(text1.length()!=text2.length()){
            return false;
        }
        for(int i = 0; i<text1.length(); i++ ){
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        for(int i = 0; i<256; i++){
            if(frequency1[i]!=frequency2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        //create scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String text1 = sc.nextLine();
        System.out.println("Enter the String2 : ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);
        //Display result
        System.out.println("The strings are anagram :" + result);
    }
}
