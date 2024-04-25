//WhileLoopAddNumber Done
import java.util.Scanner;
	public class WhileLoopAddNumber{
	public static void main(String[] args){

	int input3 = 0;
	int counter = 0;

	Scanner input = new Scanner (System.in);
	
	do {

	System.out.println("enter first number: ");
	int input1 = input.nextInt();

	System.out.println("enter 2nd number: ");
	int input2 = input.nextInt();


	int SumOfNumbers = input1 + input2;
	System.out.println("The sum of "+ input1 + " and " + input2 + " is = " + SumOfNumbers);

	System.out.println("do you want to play gain(1 = yes/ 2 = no): ");
	input3 = input.nextInt();

	
	
	} while(input3 == 1);


}

}