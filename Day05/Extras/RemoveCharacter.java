import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class RemoveCharacter {

    public static String removeCharacter(String str, char ch){
        String res = "";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)!=ch){
                res += str.charAt(i);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.nextLine();
        System.out.println("Enter the character ");
        char c = sc.next().charAt(0);

        String result = removeCharacter(text, c);
        System.out.println("The modified string is "+result);
    }
}
