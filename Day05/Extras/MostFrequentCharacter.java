import java.util.Scanner;

public class MostFrequentCharacter {

    public static char mostFrequent(String str){
        int frequency [] = new int[256];

        for(int i = 0; i<str.length();i++){
            char ch1 = str.charAt(i);
            frequency[ch1]++;
        }
        int ch = 0;
        char mfrequent = ' ';
        for(int i = 0; i<256; i++){
            if(frequency[i]>ch){
                ch = frequency[i];
                mfrequent = (char)i;
            }
        }


        return (char) mfrequent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.nextLine();

        char result = mostFrequent(text);
        System.out.println("The most frequent character is : " + result);
    }
}
