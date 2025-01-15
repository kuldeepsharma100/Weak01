import java.util.Scanner;

public class StringLength {
    
	//Method to find the length of a string
	public static int count(String str ){
	  int length = 0;
	  for(int i =0; ; i++){
		  
	  try{
	     str.charAt(i);
		 length++;
	  }catch ( StringIndexOutOfBoundsException e){
		break;
	  }
	  }
	  return length;
	
	}

	public static void main(String [] args ){
		//Create Scanner object for user input
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter String ");
	 String st = sc.next();
	 
	 //User Defined method
	 System.out.println(" User defined Method " + User count(st));
	 
	 //Inbuilt Method
	 System.out.println(" Inbuilt Method " + st.length());
	 
	 
	
	}
}