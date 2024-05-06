//PizzaWahala

import java.util.Arrays;
import java.util.Scanner;


public class PizzaWahala{
public static void main(String[] args){



	Scanner input = new Scanner(System.in);

	

	int price0 = 2000; //SapaSize
	int price1 = 2400; //SmallMoneySize
	int price2 = 3000; //BigBoysSize
	int price3 = 4200; //OdogwuSize



	int slices0 = 4; //SapaSize
	int slices1 = 6; //SmallMoneySize
	int slices2 = 8; //BigBoySize
	int slices3 = 12; //OdogwuSize


	String nameOfPizzas0 = "Sapa Size"; //SapaSize
	String nameOfPizzas1 = "Small Money Size"; //SmallMosneySize
	String nameOfPizzas2 = "Big Boy Size"; //BigBoysSize
	String nameOfPizzas3 = "ODOGWU Size"; //OdogwuSize


	int typeOfPizza = 0;
	int priceOfPizza = 0;
	String nameOfPizza = new String();
	int slicePerPizza = 0;
	int remainingPizza = 0;
	int count = 0;
	
	


	System.out.println("Customers Name: ");
	String userName  = input.nextLine();

	System.out.println("Number of Guests: ");
	int numberOfGuests  = input.nextInt();
	
	System.out.println("press 1 for Sapa Size");
	System.out.println("press 2 for Small Money Size");
	System.out.println("press 3 for BIG BOYS Size");
	System.out.println("press 4 for ODOGWU Size");
	System.out.println("\n");


		System.out.print("Type of pizza: ");
		typeOfPizza  = input.nextInt();
		

		if (typeOfPizza == 1){
			
			nameOfPizza = nameOfPizzas0;
			slicePerPizza = slices0;
			priceOfPizza = price0;
		}else 
		if (typeOfPizza == 2){

			nameOfPizza = nameOfPizzas1;
			slicePerPizza = slices1;
			priceOfPizza = price1;
		
		}else 
		if (typeOfPizza == 3){

			
			nameOfPizza = nameOfPizzas2;
			slicePerPizza = slices2;
			priceOfPizza = price2;
			
					
		}else
		if (typeOfPizza == 4){

			nameOfPizza = nameOfPizzas3;
			slicePerPizza = slices3;
			priceOfPizza = price3;
			
		
		}else System.out.println("!!!!Not a pizza type TRY AGAIN");



//Ask how to make this code repeat when there is a wrong input prompt



	double numberOfboxesFloat = (double) numberOfGuests / slicePerPizza;
	int numberOfboxesWhole = numberOfGuests / slicePerPizza;
	double pizzaToAddTo = numberOfGuests - (slicePerPizza * numberOfboxesWhole);
	int numberOfBoxesNeeded = numberOfboxesWhole + 1;
	int remainingPizzaSlice = slicePerPizza * numberOfBoxesNeeded  - numberOfGuests;
	double Price = numberOfBoxesNeeded * priceOfPizza;

		


	// System.out.println(typeOfPizza);
	System.out.println(nameOfPizza);
	//System.out.println(priceOfPizza);
	System.out.println("Number of boxes of pizza to buy = " + numberOfBoxesNeeded);
	System.out.println("Number of left over slices after serving = "+ remainingPizzaSlice);	
	System.out.println("Price = "+Price);





}
}



