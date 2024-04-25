import java.util.Scanner;
	public class ThreewayNumber {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int positivenumber = 0;
	int negativenumber = 0;
	int zeronumber = 0;

	System.out.print("Enter a number or press 50 to end: ");
	int input2 = input.nextInt();

	while (input2!=50){
		


		if (input2 <= 0){
	
		negativenumber = negativenumber + 1;
		}

		if (input2 >= 0){
	
		positivenumber = positivenumber + 1;
		}

		if (input2 == 0){
	
		zeronumber = zeronumber + 1;
		}

	System.out.print("Enter a number or press 50 to end: ");
	input2 = input.nextInt();



	}

	System.out.println("The input of positive numbers are =" + positivenumber);

	System.out.println("The input of negative numbers are = " + negativenumber);

	System.out.println("The input of zero numbers are = "+ zeronumber);




}
}


	




	  