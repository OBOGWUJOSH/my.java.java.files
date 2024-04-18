//average of 5

import java.util.Scanner;
	
	public class Task6{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int sumOfNumbers = 0;
	int inputnumber = 0;
	int counter = 0;
	double average = 0;
	int numberOfInput = 5;


	for (int x = 0; x < 10; x++){
	
		System.out.print("input a number:  ");
		inputnumber = input.nextInt();
		
	
		sumOfNumbers += inputnumber;
		}counter++;



	//Average

	average = (sumOfNumbers/numberOfInput);

	
	
	System.out.printf("%s%.2f", "The the average of task five is = ", average);
	System.out.println(" ");

}

}

