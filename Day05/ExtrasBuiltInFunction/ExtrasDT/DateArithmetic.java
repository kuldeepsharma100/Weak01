import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Take a date from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.next();
        
        // Parse the input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);
        
        // Perform arithmetic operations
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);
        
        // Display results
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate.format(formatter));
        System.out.println("After Subtracting 3 Weeks: " + finalDate.format(formatter));
        
        sc.close();
    }
}
