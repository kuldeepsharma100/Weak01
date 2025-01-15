import java.util.Scanner;
public class SplitString{

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

		public static String [] split(String str ){
		String word = "";
		int count =0, index = 0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)== ' '){ count ++;}
		}
		String res[] = new String[count+1];
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)!= ' ' && i != str.length()-1){
				word += str.charAt(i);
			}else{
				if (!word.isEmpty()) {

				res[index] = word;
				
				word = "";
				index++;
				}
			}
		}
		
		return res;
		
	}
	
	
	 // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

	public static void main(String [] arg){
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();
		  
        // Split using user-defined method
        String[] userdefined = split(str);

        // Split using built-in split() method
        String[] builtInSplitWords = str.split(" ");

        // Compare the results
        boolean areEqual = compareArrays(userdefined, builtInSplitWords);

        // Display the results
        System.out.println("Custom Split Words:");
        for (String word : userdefined) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("Are the results identical? " + areEqual);
    }

}