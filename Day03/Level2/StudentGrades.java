import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays to store data
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            int marks;

            // Input Physics marks
            while (true) {
                System.out.print("Enter marks for Physics (0-100): ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    physics[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
                }
            }

            // Input Chemistry marks
            while (true) {
                System.out.print("Enter marks for Chemistry (0-100): ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    chemistry[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
                }
            }

            // Input Maths marks
            while (true) {
                System.out.print("Enter marks for Maths (0-100): ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) {
                    maths[i] = marks;
                    break;
                } else {
                    System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
                }
            }

            // Calculate percentage
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Student\t\tPhysics\t\tChemistry\tMaths\t\tPercentage\t\tGrade");
      for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t\t" + physics[i] + "\t\t" + chemistry[i] + "\t\t" + maths[i] + "\t\t" + percentages[i] + "\t\t" + grades[i]);
        }


    }
}
