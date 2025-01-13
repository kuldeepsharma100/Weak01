import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop to find and print all multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        
		if(number<100){
		for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
		}else{
	       System.out.print("Enter a number below 100 ");

		}

    }
}
