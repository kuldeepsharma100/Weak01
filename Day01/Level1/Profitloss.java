
public class Profitloss{
	public static void main (String arg[]){
		// cost price
		int costPrice = 129;
		
		// selling price 
		int sellingPrice = 191;
		
		// Profit is 
		 int profit = sellingPrice - costPrice;
		
		// Profit percentage
		double profitPercentage = ((double)profit/(double)costPrice)*100;
			
		System.out.println("The Cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		System.out.println("The Profit is INR " + profit + " and Profit Percentage is " + profitPercentage);
	}
}