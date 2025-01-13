import java.util.Scanner;

public class FriendInfo {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Amar";

        if (ages[1] < youngestAge) {
            youngestAge = ages[1];
            youngestFriend = "Akbar";
        }
        if (ages[2] < youngestAge) {
            youngestAge = ages[2];
            youngestFriend = "Anthony";
        }
        return youngestFriend;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        String tallestFriend = "Amar"; 

        if (heights[1] > tallestHeight) {
            tallestHeight = heights[1];
            tallestFriend = "Akbar";
        }
        if (heights[2] > tallestHeight) {
            tallestHeight = heights[2];
            tallestFriend = "Anthony";
        }
        return tallestFriend;
    }

       public static void main(String[] args) {
		   // create scanner object
         Scanner sc = new Scanner(System.in);

        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages
        System.out.println("Enter the age of Amar: ");
        ages[0] = sc.nextInt();
        System.out.println("Enter the age of Akbar: ");
        ages[1] = sc.nextInt();
        System.out.println("Enter the age of Anthony: ");
        ages[2] = sc.nextInt();

        // Input for heights
        System.out.println("Enter the height of Amar in meters: ");
        heights[0] = sc.nextDouble();
        System.out.println("Enter the height of Akbar in meters: ");
        heights[1] = sc.nextDouble();
        System.out.println("Enter the height of Anthony in meters: ");
        heights[2] = sc.nextDouble();

        // Find and display the youngest friend
        String youngestFriend = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find and display the tallest friend
        String tallestFriend = findTallest(heights);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}
