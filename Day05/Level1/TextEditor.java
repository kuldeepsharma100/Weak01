

import java.util.Scanner;

public class TextEditor{

	public static String toUpper(String str){
	    String res = "";
		
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch>='a'&& ch<='z'){
				ch -= 32;
				res += ch;
				
			}else{
				res +=ch;
				
			}
			
		}
		
		return res;
		
	}
	
	
	public static boolean compareString(String str1 , String str2){
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		for(int i = 0; i<str1.length(); i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
		
	}
	
	
	public static String [][] split(String str ){
		String word = "";
		int count =0, index = 0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)== ' '){ count ++;}
		}
		String res[][] = new String[count+1][2];
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)!= ' ' && i != str.length()-1){
				word += str.charAt(i);
			}else{
				if (!word.isEmpty()) {

				res[index][0] = word;
				int c = word.length();
				res[index][1] = String.valueOf(c); 
				word = "";
				index++;
				}
			}
		}
		
		return res;
		
	}
	
	

	public static void main (String [] args ){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter first String: ");
	String str1 = sc.nextLine();
	System.out.println("Enter second String: ");
	String str2 = sc.nextLine();
	
	String userdefined = toUpper(str1);
	String inbuilt = str1.toUpperCase();
	
	if(compareString(str1,str2)){
		System.out.println("Both are same");
	}else{
		System.out.println("Both are different");
	}

	String [][] result = split(str1);
	
	for(int i = 0; i<result.length; i++){
		for(int j=0; j<result[0].length; j++){
			System.out.println(result[i][j]);
		}
	}
	
	
		
	
	}

}