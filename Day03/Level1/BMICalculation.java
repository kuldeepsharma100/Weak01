import java.util.Scanner;

public class BMICalculation{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	
	
	 int weight [] = new int[number];
	 int height [] = new int[number];
	 int BMI [] = new int[number];
	 String status [] = new String[number];
	 
	 for(int i = 0; i<number; i++){
		System.out.println("Enter weight of a person in kg ");
		weight[i] = sc.nextInt();
		System.out.println("Enter height of a person in meter ");
		height[i] = sc.nextInt();
	 }
	 
	  for(int i = 0; i<number; i++){
		BMI[i] = weight[i]/(height[i]*height[i]);
		if(BMI[i]<=18.4){
		status[i] = "UnderWeight";
		}else if(BMI[i]<=24.9){
		status[i] = "Normal";
		}else if(BMI[i]<=39.9){
		status[i] = "Overweight";
		}else {
		status[i] = "Obese";
		}
		
	 }


	 for(int i = 0; i<number; i++){
		System.out.println("Height = " + height[i] + "Weight = " + weight[i] + " BMI = " + BMI[i] + " Status = " + status[i]);
	 }
	 
	
	}


}