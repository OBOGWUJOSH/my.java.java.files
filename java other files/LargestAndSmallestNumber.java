//LargestAndSmallest
import java.util.Scanner;
	public class LargestAndSmallestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);


	System.out.println("enter anynumber from 1 to 99 or enter 100 to stop : ");


	double input1 = input.nextInt();
	double largestnumber = 0;
	double smallestnumber = 0;
	double input2 = 0;



	while(input1 != 100){
	largestnumber = 0;
	smallestnumber = 0;
	input2 = 0;
	

		
		if (input1 > largestnumber){
			largestnumber = input1 ;
			
		}

		else
		if (input1 < largestnumber){
			smallestnumber = input1 ;
		}

		/*else
		if (input1 < largestnumber){
			input2 = smallestnumber;
		}*/



	System.out.println("enter another number: ");
	input1 = input.nextInt();


	} 
	

	System.out.println (smallestnumber);
	System.out.println (largestnumber);


	
	


}


}