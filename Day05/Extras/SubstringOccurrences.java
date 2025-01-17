import java.util.Scanner;

public class SubstringOccurrences {

    public static int occurrenceCount(String text1 , String text2){
        String result [] = text1.split(" ");
        int count = 0;
        for(String word : result){
            if(word.equals(text2)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        //Create the Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.nextLine();
        System.out.println("Enter the sub string ");
        String sub = sc.nextLine();

        int res = occurrenceCount(text,sub );
        System.out.println("The occurence is "+ res);

    }
}
