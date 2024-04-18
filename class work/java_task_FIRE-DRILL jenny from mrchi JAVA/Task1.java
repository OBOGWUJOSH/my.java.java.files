//10 scores 

import java.util.Scanner;
	
	public class Task1{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int sumOfNumbers = 0;
	int inputnumber = 0;
	int counter = 0;


	for (int x = 0; x < 10; x++){

	System.out.println("input a number: ");
	inputnumber = input.nextInt();
	
	sumOfNumbers += inputnumber;
	}counter++;

	
	
	System.out.printf("%s%d", "The sum of the 10 numbers are = ", sumOfNumbers);



	}

	}