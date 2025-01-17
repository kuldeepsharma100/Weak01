import java.util.Scanner;

public class CountVowelConsonant {

	// Method to count vowels and consonants
	public static int[] count(String str ){
	
	int vowel = 0, consonant=0;
	for(int i = 0; i< str.length(); i++){
	char ch = str.charAt(i);
	 if(ch>='A' && ch <='Z'){
	 ch += 32;
	 }
	 
	 if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
	    vowel++;
	 }else {
	 consonant++;
	 }
	
	}
	
	return new int[]{vowel, consonant};
	
	}
	
	
	
	public static void main(String [] args ){
		//Create Scanner object for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		
		int [] result = count(str);
		
		System.out.println("Number of vowels are " + result[0] );
		System.out.println("Number of Consonants are " + result[1] );
	
	
	
	}


}