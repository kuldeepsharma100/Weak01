import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
		// create scanner object
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        
        System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
    }
}
