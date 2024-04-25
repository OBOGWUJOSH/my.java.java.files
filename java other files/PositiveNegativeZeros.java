//factorialValue DONE
import java.util.Scanner;
	public class PositiveNegativeZeros {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int positivenumber = 0;
	int negativenumber = 0;
	int zeronumber = 0;
	

	for (int number=0; number <10; number++){


	System.out.println("numberinput: ");
	int input1 = input.nextInt();
		
		if (input1>0){ 

		positivenumber = positivenumber + 1;

		}

		if (input1<0){ 

		negativenumber = negativenumber + 1;

		}


		if (input1==0){ 

		zeronumber = zeronumber + 1;

		}

		

	}

		System.out.println("The number of positive numbers are " + positivenumber);
		System.out.println("The number of negative numbers are " + negativenumber);
		System.out.println("The number of zeronumber numbers are " + zeronumber);
	
	
	
	







}
}