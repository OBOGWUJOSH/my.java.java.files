//10 scores average

import java.util.Scanner;
	
	public class Task2{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int sumOfNumbers = 0;
	int inputnumber = 0;
	int counter = 0;
	double average = 0;
	int numberOfInput = 10;


	for (int x = 0; x < 10; x++){

	System.out.println("input a number: ");
	inputnumber = input.nextInt();
	
	sumOfNumbers += inputnumber;
	}counter++;

	
	
	System.out.printf("%s%d", "The sum of the 10 numbers are = ", sumOfNumbers);
	System.out.println("");


	//Average
	
	average = (sumOfNumbers/numberOfInput);

		System.out.printf("%s%.2f", "The average of the 10 numbers are = ", average);
	System.out.println("");
	


	}

	}