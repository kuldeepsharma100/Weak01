import java.util.*;

public class PrimeRange{

	public static boolean isPrime(int num){
		boolean isp = true;
		if(num <=1){
			return false;
		
		}else{
			for(int i =2;i<num; i++){
				if(num%i == 0){
					isp = false;
					break;
				}
				
			}
			return isp;
			
		}
	
	}

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start; i<=end; i++){
			
		if(isPrime(i)){
			System.out.println(i +" is Prime");
			
		}else{
			System.out.println(i+ " is Not");
		}
		}
	
	
	}


}