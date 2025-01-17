import java.util.Scanner;
import java.util.Arrays;


public class ReplaceWord {

    public static String replaceWord( String sentence, String word1 , String word2){

        String [] res = sentence.split(" ");

        for(int i = 0; i<res.length; i++){
            if(word1.equals(res[i])){
                res[i] = word2;
            }
        }

        return String.join(" ", res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word : ");
        String word1 = sc.nextLine();
        System.out.println("Enter the String : ");
        String word2 = sc.nextLine();

        String result = replaceWord(sentence, word1, word2);
        System.out.println("The modified string is " + result);
    }
}
