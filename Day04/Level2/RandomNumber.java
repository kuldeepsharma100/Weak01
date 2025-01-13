import java.util.Arrays;

public class RandomNumber {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;  
        }
        
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array of numbers
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = sum / numbers.length;
        
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {

        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find the average, minimum, and maximum
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
