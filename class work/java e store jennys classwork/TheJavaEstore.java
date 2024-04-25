import java.util.Scanner;
	public class TheJavaEstore{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int input2 = 0;
	int total = 0;
	int CustomersInput = 0;
	double TenPercentDiscount = 0.1;
	double discounts = 0;
	double discountedPrice = 0;
	


	System.out.println("welcome to the E-store");



	System.out.println("please enter your name: ");
	String input1 = input.nextLine();




	while(counter < 10) {

		System.out.println("price of product: ");
		input2 = input.nextInt();
		total += input2;
		counter++;
		}

		//System.out.println("The total cost of items is");



	if (total < 200){

		discounts = total * 0.1;
		discountedPrice = total - discounts;
	}

		System.out.printf("%s%s%n","customers name: ", input1);
		System.out.printf("%s%d%n", "orignal cost: ", total);
		System.out.printf("%s%.2f%n","Total discounted price is: ", discountedPrice);
			if (total <= 200){
			System.out.println("No discount");}
		System.out.println("Thanks for your patronage!!!");
		




	


		

		
	


	



	}





	}