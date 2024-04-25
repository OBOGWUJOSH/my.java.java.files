import java.util.Arrays;
import java.util.Scanner;
	public class ArrayOfNumbers{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int[] numbers = new int [5];
	int[] outputs  = new int [5];
	
	int numberSum = 0;
	int number = 0;



  

	for (int x = 0; x < 5; x++){

	System.out.println("number input:  ");
	number = input.nextInt();
	numbers[x] = number;

	numberSum += number;
	
	}



	
	for (int counter = 0; counter < 5; counter++){
	
	outputs[counter] = (numberSum - numbers[counter]);

	}

	System.out.print(Arrays.toString(outputs));



	


	




}
}