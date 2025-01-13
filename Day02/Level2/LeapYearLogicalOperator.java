import java.util.Scanner;

public class LeapYearLogicalOperator {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);


        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check the year 
        if (year >= 1582) {
           
            //Using a single if statement with logical operators
			
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is invalid.");
        }

    }
}
