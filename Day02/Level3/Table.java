import java.util.Scanner;
public class Table {
	public static void main(String [] args){
	
	// Create Scanner Object 
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the number: ");
	int number = sc.nextInt();
	
	for(int i = 1; i<=10; i++){
	
			System.out.println( number +" * " + i + " = " + (number*i));
	
		}
	
	}

}