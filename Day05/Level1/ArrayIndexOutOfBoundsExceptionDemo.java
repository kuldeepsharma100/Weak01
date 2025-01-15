import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        String name = names[10]; 
    }

    // Method to handle ArrayIndexOutOfBoundsException 
    public static void handleException(String[] names) {
        try {
            generateException(names); // Call method to generate the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for names
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
      

        String[] names = new String[n]; 

        // Taking names input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call method to handle exceptions
        handleException(names);

    }
}
