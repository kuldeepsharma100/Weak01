import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
	
        // Define an array of 10 integers
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

    }
}
