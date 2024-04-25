import java.util.Scanner;
 	public class LargestNumber {
		public static void main(String []arg) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("first number:  ");
		int input1 = input.nextInt();

		System.out.println("second number:  ");
		int input2 = input.nextInt();

		System.out.println("third number:  ");
		int input3 = input.nextInt();



if (input1 > input2){
		System.out.printf("The largest number is%2d", input1);}

else
if (input2 > input3){
		System.out.printf("The largest number is%2d", input2);}

else
if (input3 > input1){
		System.out.printf("The largest number is%2d", input3);}

		


		
		}
}