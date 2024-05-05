import java.util.Scanner;
	public class TheJavaEstore2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int input2 = 0;
	int total = 0;
	double percentDiscounted = 0;
	double discounts = 0;
	double discountedPrice = 0;
	


	System.out.println("welcome to the E-store");



	System.out.println("please enter your name: ");
	String input1 = input.nextLine();


	System.out.println("please enter the number of item purchased: ");
	int times = input.nextInt();

	System.out.println("please enter the amount in discount: ");
	int discountAmout = input.nextInt();


	while(counter <= times) {

		System.out.printf("%s%d%s", "price of product ", +counter, ": ");
		input2 = input.nextInt();
		total += input2;
		counter++;
		}



	percentDiscounted = discountAmout/100;



	if (total >= 200){

		discounts = total * percentDiscounted;
		discountedPrice = total - discounts;
	}




		System.out.printf("%s%s%n", "customers name: ", input1);
		System.out.printf("%s%d%n", "number of item bought: ", times);
		System.out.printf("%s%d%n", "percentage discounted: ", discountAmout);
		System.out.printf("%s%d%n", "orignal cost: ", total);
		//System.out.printf("%s%.2f%n","Total discounted price is: ",discountedPrice);
			if (total < 200){
			System.out.println("No discount");}
		System.out.println("Thanks for your patronage!!!");
		
		




	


		

		
	


	



	}





	}