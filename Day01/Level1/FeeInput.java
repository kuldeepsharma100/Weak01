import java.util.Scanner;

public class FeeInput {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
		 System.out.println("Enter fee");
		 // Course fee
        int fee = sc.nextInt();
		
		System.out.println("Enter discount percentage");
		// Discount percentage
        int discountPercent = sc.nextInt(); 

        // Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Final fee after discount
        int discountedFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
