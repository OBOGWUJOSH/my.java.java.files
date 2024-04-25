//FIX THE CODE AND MAKE THE CODE CLEAD,READABLE AND FIX THE MATHS 

import java.util.Scanner;
    public class CreditLimitCalculator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print ("account balance: ");
	int acountBalance = input.nextInt();

	System.out.print("Enter month balance: ");
	int monthBalance = input.nextInt();
	
	System.out.print("number of item Charged: ");
	int itemCharged = input.nextInt();

	System.out.print("Enter Number of Credit Applied: ");
	int numberOfCreditApplied  = input.nextInt();
	
	System.out.print("Allowed Credit Limit: ");
	int creditLimit = input.nextInt();



	double newBalance = monthBalance + itemCharged - numberOfCreditApplied ;

	System.out.print(newBalance);

    }

}