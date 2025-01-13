import java.util.Scanner;

public class LeapYear {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            // Year is a leap year if divisible by 4 and not divisible by 100,
            // or divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
		// Create Scanner Object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
}
