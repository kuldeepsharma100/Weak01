import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
		//creat scanner object 
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
     
    }
}
