public class NumberChecker3 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is an automorphic number
  public static boolean isAutomorphicNumber(int number) {
    int square = number * number;
    while (number > 0) {
        // Compare the last digits of square and number
        if (square % 10 != number % 10) {
            return false;
        }
        // Remove the last digit
        square /= 10;
        number /= 10;
    }
    return true;
}


    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 7;

        // Check if the number is a prime number
        System.out.println("Is Prime Number: " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is Neon Number: " + isNeonNumber(number));

        // Check if the number is a spy number
        System.out.println("Is Spy Number: " + isSpyNumber(number));

        // Check if the number is an automorphic number
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));

        // Check if the number is a buzz number
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}
