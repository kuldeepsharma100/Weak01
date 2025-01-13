import java.util.Scanner;

public class BMICalculation{
	public static void main(String [] args){
	
	// Create Scanner Object for user input 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of person ");
	int number = sc.nextInt();
	
	// Create Array for weight, height, BMI and status
	 int weight [] = new int[number];
	 int height [] = new int[number];
	 double BMI [] = new double[number];
	 String status [] = new String[number];
	 
	 // Take Weight and Height as input
	 for(int i = 0; i<number; i++){
		System.out.println("Enter weight of a person in kg ");
		weight[i] = sc.nextInt();
		System.out.println("Enter height of a person in meter ");
		height[i] = sc.nextInt();
	 }
	 
	  for(int i = 0; i<number; i++){
		BMI[i] = (double)weight[i]/(double)(height[i]*height[i]);
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

	// display the result
	 for(int i = 0; i<number; i++){
		System.out.println("Height = " + height[i] + " Weight = " + weight[i] + " BMI = " + BMI[i] + " Status = " + status[i]);
	 }
	 
	
	}


}