
import java.util.Arrays;
import java.util.Scanner;
public class GuessingGame{
public static void main(String[] args){

	
	Scanner input = new Scanner (System.in);
	int counter = 0;

	for (int x = 0; x < 3; x++){

		System.out.println("Enter a lucky number from 1 to 10: " );
		int numberInput = input.nextInt();

		if(numberInput != 5){
		
		System.out.println("wrong number try again");
		}


		else 
 		if (numberInput == 5){

		System.out.println("congratulation you have won");
			break;
	
		}
	

	}counter++;


	
}

} 