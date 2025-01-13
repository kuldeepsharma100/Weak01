public class SpringSeason {

    // Method to check if the given month and day fall in the spring season
    public static boolean springSeason(int month, int day) {
        
        if ((month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }

        // Parse the input arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date is in spring season
        boolean isSpring = springSeason(month, day);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
