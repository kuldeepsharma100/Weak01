import java.util.Scanner;

public class Text1 {

    // Method to split text into words using charAt()
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

    // Method to calculate string length without using length()
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

    // Method to create a 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(count(words[i]));
        }

        return result;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int currentLength = Integer.parseInt(wordLengths[i][1]);
            if (currentLength < shortestLength) {
                shortest = wordLengths[i][0];
                shortestLength = currentLength;
            }
            if (currentLength > longestLength) {
                longest = wordLengths[i][0];
                longestLength = currentLength;
            }
        }

        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[] words = split(text);

        String[][] wordLengths = wordsWithLengths(words);

        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);


    }
}