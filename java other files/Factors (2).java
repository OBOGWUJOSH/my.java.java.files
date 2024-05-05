import java.util.Scanner;
	public class Factors {
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	System.out.println("input number: ");
	int input1 = input.nextInt();


	System.out.println("The " + " factors " + " of " + input1);

	for (int x = 1; x <= input1; x++ ){
		
		
		if (input1 % x == 0){

				System.out.println(x);
 
				

			}
		
		}



}






}