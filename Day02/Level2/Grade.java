import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        // Input marks for subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        
        // Calculate total and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        // Initialize grade and remarks
        String grade;
        String remarks;
        
        // Determine grade and remarks
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

    }
}