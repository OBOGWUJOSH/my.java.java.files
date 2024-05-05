//PizzaWahala

import java.util.Arrays;
import java.util.Scanner;


public class PizzaWahala{
public static void main(String[] args){



	Scanner input = new Scanner(System.in);

	
	int [] price = new int [4];

	price[0] = 2000; //SapaSize
	price[1] = 2400; //SmallMoneySize
	price[2] = 3000; //BigBoysSize
	price[3] = 4200; //OdogwuSize


	int [] slices = new int [4];

	slices [0] = 4; //SapaSize
	slices [1] = 6; //SmallMoneySize
	slices [2] = 8; //BigBoysSize
	slices [3] = 12; //OdogwuSize

	int typeOfPizza = 0;
	int slicePerPizza = 0;
	int count = 0;





	System.out.println("Customers Name: ");
	String userName  = input.nextLine();

	System.out.println("number of guests: ");
	int numberOfGuests  = input.nextInt();
	
	System.out.println("press 1 for Sapa Size");
	System.out.println("press 2 for Small Money Size");
	System.out.println("press 3 for BIG BOYS Size");
	System.out.println("press 4 for ODOGWU Size");

	


		System.out.println("Type of pizza: ");
		typeOfPizza  = input.nextInt();
		

		if (typeOfPizza == 1){
			
			typeOfPizza = slices[0];
			//System.out.println(slices[0]);
		}
		else 
		if (typeOfPizza == 2){

			typeOfPizza = slices[1];
			//System.out.println(slices[1]);
		
		}	
		else
		if (typeOfPizza == 3){
			
			typeOfPizza = slices[2];
			//System.out.println(slices[2]);
					
		}else 
		if (typeOfPizza == 4){

			typeOfPizza = slices[3];
			System.out.println(slices[3]);
		
		}
		else System.out.println("!!!!Not a pizza type TRY AGAIN");
	

		//Ask dayo how to make this code repeat when there is a wrong input prompt

		
	System.out.println("number of boxes: ");
	int numbersOfBoxes  = input.nextInt();






	//System.out.println(Arrays.toString(price));
	//System.out.println(Arrays.toString(slices));


	int numberOfSlices = numbersOfBoxes * typeOfPizza;

	if 
	int remainingPitza = numberOfSlices - numberOfGuests;


	
	System.out.println("Number of slices in "+ numbersOfBoxes + " boxes of pizza is : " +    numberOfSlices);
	System.out.println("you have " + remainingPitza + " remaining slices of pizza");







}
}



