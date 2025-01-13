import java.util.Scanner;

public class TotalPrice{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter unit price");
		int unitPrice = sc.nextInt();
		
		System.out.println("Enter Item");
		int quantity = sc.nextInt();
		
		int price = unitPrice*quantity;
		
		//Print the result
		System.out.println("The total purchase price is INR " + price + " if the quantity " + quantity +  " and unit price is INR " + unitPrice);
		
		
	}
}