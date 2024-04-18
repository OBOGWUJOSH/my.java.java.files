//even index

import java.util.Scanner;
	
	public class Task4{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int sumOfNumbers = 0;
	int inputnumber = 0;
	int counter = 0;
	double average = 0;
	int numberOfInput = 10;


	for (int x = 1; x <= 10; x++){
	
		System.out.print("input a number:  ");
		inputnumber = input.nextInt();
	
		if (x%2 == 0){
	
		sumOfNumbers += inputnumber;
		}counter++;

		}

	
	
	System.out.printf("%s%d", "The sum of the 10 numbers are = ", sumOfNumbers);
	System.out.println("");


	


	}

	}