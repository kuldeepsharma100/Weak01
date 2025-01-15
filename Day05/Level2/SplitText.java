import java.util.Scanner;

public class SplitText {

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

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(count(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        // Split text into words
        String[] words = split(str);

        //  Get words with their lengths
        String[][] wordsWithLengths = wordsWithLengths(words);

        // Step 4: Display results in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------");
        for (String[] entry : wordsWithLengths) {
            String word = entry[0];
            int length = Integer.parseInt(entry[1]);
            System.out.println( word + " " +  length);
        }
    }
}
