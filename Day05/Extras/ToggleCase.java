import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str ){
        String result = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch += 32;
            }else{
                ch -=32;
            }
            result +=ch;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.nextLine();

        String toggledString = toggleCase(text);
        System.out.println("The toggled string is : " + toggledString);
    }
}
