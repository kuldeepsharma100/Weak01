import java.util.Scanner;

public class BMIMultidimensionArray{
	public static void main(String [] args){
	
	// Create Scanner Object for user input 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of person ");
	int number = sc.nextInt();
	
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];

	 
	 // Take Weight and Height as input
	 for(int i = 0; i<number; i++){
		System.out.println("Enter weight of a person in kg ");
		personData[i][0] = sc.nextDouble();
		System.out.println("Enter height of a person in meter ");
		personData[i][1] = sc.nextDouble();
	 }
	 
	  for(int i = 0; i<number; i++){
		  
		personData[i][2] = personData[i][0]/(personData[i][1]*personData[i][1]);
		if(personData[i][2]<=18.4){
		weightStatus[i] = "UnderWeight";
		}else if(personData[i][2]<=24.9){
		weightStatus[i] = "Normal";
		}else if(personData[i][2]<=39.9){
		weightStatus[i] = "Overweight";
		}else {
		weightStatus[i] = "Obese";
		}
		
	 }

	// display the result
	 for(int i = 0; i<number; i++){
		 for(int j =0; j<3; j++){
		System.out.println("Height = " + personData[i][j] + " Weight = " + personData[i][j] + " BMI = " + personData[i][j] + " Status = " + weightStatus[i]);
		 }
	 }
	 
	
	}


}