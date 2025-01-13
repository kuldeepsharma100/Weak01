public class Fee {
    public static void main(String[] args) {
         
		 // Course fee
        int fee = 125000;
		
		// Discount percentage
        int discountPercent = 10; 

        // Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Final fee after discount
        int discountedFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
