import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month based on the month number
    public static String getMonthName(int month) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month];
    }

    // Method to get the first day of the month using the Gregorian Calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        
        return d0;
    }

    public static void displayCalendar(int month, int year) {


        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("    " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");  // Print empty spaces
        }

        // Display the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
         System.out.print(" " + day);

            // If it's Saturday (end of the week), move to the next line
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for month and year
        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();
        
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        sc.close();
    }
}
