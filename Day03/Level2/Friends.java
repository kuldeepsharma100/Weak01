import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        // Finding the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; 
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; 
            }
        }
        
        System.out.println("The youngest friend is " + (youngestIndex == 0 ? "Amar" : (youngestIndex == 1 ? "Akbar" : "Anthony")) );
        System.out.println("The tallest friend is " + (tallestIndex == 0 ? "Amar" : (tallestIndex == 1 ? "Akbar" : "Anthony")));
        

    }
}
