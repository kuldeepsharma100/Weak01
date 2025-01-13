import java.util.Arrays;

public class FootballTeam {

    // Method to generate an array of random heights for players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; 
        }
        
        return heights;
    }

    // calculate the sum 
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // calculate the mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    //  find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {

        int size = 11;
        int[] heights = generateRandomHeights(size);

        double mean = calculateMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display results
        System.out.println("Player Heights (in cms): " + Arrays.toString(heights));
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
