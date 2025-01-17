import java.util.Scanner;

public class LongestWord {
    // Create method to find longest Word
    public static String longestWord(String str){

     String [] res = str.split(" ");
    
     String logestWord = "";
     for(String word : res){
        if(word.length() > logestWord.length()){
            logestWord = word;
        }
     }


        return logestWord;
    }
    public static void main(String[] args) {
        //Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.nextLine();
        //call the user defined method 
        String result = longestWord(text);
        //Display the result
        System.out.println("The longest word in the String is : " + result);


    }
}
