import java.util.Scanner;
import java.util.Arrays;

	public class ArrayWithLoopNumber{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;


	int[] number = new int[5];



	for (int x = 0; x < 5; x++) {

	System.out.println("input Number: ");
	int inputNumber = input.nextInt();

	int multiplication = (inputNumber * 2);

	numbers[x]= multiplication;
	
	}


	for (int i=0; i<5; i++){


	System.out.printf("%s%d%n", "The input multiplied by 2 is: ", number[i]);


	}
	
	


	System.out.println(Arrays.toString(numbers));







	








}



}
