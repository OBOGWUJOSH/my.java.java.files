//even numbers

import java.util.Scanner;
	
	public class Task5{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int sumOfNumbers = 0;
	int inputnumber = 0;
	int counter = 0;
	double average = 0;
	int numberOfInput = 10;


	for (int x = 0; x < 10; x++){
	
		System.out.print("input a number:  ");
		inputnumber = input.nextInt();
		
	if ((inputnumber%2) == 0){
	
		sumOfNumbers += inputnumber;
		}counter++;

	}

	
	
	System.out.printf("%s%d", "The sum of only the even numbers are = ", sumOfNumbers);
	System.out.println(" ");

}

}

