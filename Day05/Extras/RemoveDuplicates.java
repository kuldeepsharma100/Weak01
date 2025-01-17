import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){
        String result = "";

        

        for(int i = 0; i<str.length(); i++){
            char currentchar = str.charAt(i);
            boolean isunique = true;
            for(int j = 0; j<result.length(); j++){
                if(currentchar == result.charAt(j)){
                    isunique = false;
                    break;
                }
            }

            if(isunique){
                result += currentchar;

            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String text = sc.next();
        String res = removeDuplicates(text);
        System.out.println("The modified string is : "+ res);

    }
}
