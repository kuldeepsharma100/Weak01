import java.util.Scanner;

public class CompareString {

    public static int compareString(String text1, String text2){
        int length = 0;
        if(text1.length() > text2.length()){
            length = text1.length();
        }else{
            length = text2.length();
        }

        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        for(int i =0; i<length ; i++){
            if(text1.charAt(i)!=text2.charAt(i)){
                if(text1.charAt(i)>text2.charAt(i)){
                    return -1;

                }else{
                    return 1;

                }
            }
        }
                

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String text1 = sc.nextLine();
        System.out.println("Enter the String2 : ");
        String text2 = sc.nextLine();
         
        int result = compareString(text1, text2);

        if(result == 1){
            System.out.println(text1 +" comes before " + text2 +" in lexicographical order");
        }else if(result == -1){
            System.out.println(text2 +" comes before " + text1 +" in lexicographical order");
        }else {
            System.out.println("Both strings are equal ");
        }
    }
}
