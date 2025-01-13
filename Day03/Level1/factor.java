import java.util.Scanner;

public class factor {
	public static void main (String arg []){
	
	Scanner sc = new Scanner(System.in);
	int max = sc.nextInt();
	
	int arr1 [] = new int [max];
	
	for(int i = 1; i<=10; i++){
	
	if(i == max){
	 max *= 2;
	 int temp [] = new int[max];
	 for(int j = 0; j<arr1.length; j++){
	 temp[j] = arr1[j];
	 }
 	arr1 = temp;
	}else{
	arr1[i] = i;
	
	}
	}
	
	for(int i =0; i<=10; i++){
		
		
		System.out.print(arr1[i]);
	}
	
	}


}