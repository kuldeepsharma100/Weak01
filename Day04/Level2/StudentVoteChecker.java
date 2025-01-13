import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        
        return age >= 18;
    }

    public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Create an array to store age of 10 students
        int[] studentAges = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt(); 
            
            // Call the method to check if the student can vote and display the result
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

    }
}
