import java.util.Scanner;

public class TwoDtoOneD {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Take user input to fill the 2D array
        System.out.println("Enter elements of the arr:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array 
        int[] array = new int[rows * cols];
        
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = arr[i][j];
                index++;
            }
        }

        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
