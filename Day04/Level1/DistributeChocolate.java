import java.util.Scanner;

public class DistributeChocolate {

    public static int[] findRQ(int chocolates, int children) {

        int chocolatesPerChild = chocolates / children;
        
        int remainingChocolates = chocolates % children;

        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
		// create the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();

        if (children == 0) {
            System.out.println(" Number of children cannot be zero.");
        } else {
            int[] result = findRQ(chocolates, children);

            // Display the results
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("The remaining chocolates are " + result[1] + ".");
        }

        sc.close();
    }
}
