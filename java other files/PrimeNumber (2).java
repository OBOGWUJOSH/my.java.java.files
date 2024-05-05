import java.util.Scanner;
	public class PrimeNumber {
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("input number: ");
	int input1 = input.nextInt();


	int factor = 0;
	int counter = 0;

	//System.out.println("The" + "prime " + "number " + "of " + input1);

	for (int x = 1; x <= input1; x++) {
		
		factor = factor+1;
		
		if (input1 % x == 1){

				System.out.println(x);
 
			}
		}



}






}