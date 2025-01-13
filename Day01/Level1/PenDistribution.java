public class PenDistribution {
    public static void main(String[] args) {
        // Total number of pens 
        int totalPens = 14;
		
		//Total student
        int students = 3;

        // Calculate pens per student
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens
        int remainingPens = totalPens % students;

        // Output the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
