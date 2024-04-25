import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: "); 
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	
	System.out.print("Enter third number: ");
	int number3 = input.nextInt();

	int sum = number1 + number2 + number3;
	int average = (number1 + number2 + number3)/3;
	int product = number1 * number2 * number3;

	System.out.printf("sum is %d%n", sum);
	System.out.printf("average is %d%n", average);
	System.out.printf("product is %d%n", product);

	// Greatest Number

	if(number1 > number2 && number1 > number3) {
	System.out.printf("%d is the greatest", number1);
        }
	if(number2 > number3 && number2 > number1) {
	System.out.printf("%d is the greatest", number2);
        }
	if(number3 > number2 && number3 > number1) {
	System.out.printf("%d is the greatest", number3);
        }
	
 	//Smallest number 
	
	if(number1 < number2 && number1 < number3) {
	System.out.printf("%d%n is the smallest", number3);
        }
	if(number2 < number3 && number2 < number1) {
	System.out.printf("%d is the smallest", number3);
        }
	if(number3 < number2 && number3 < number1) {
	System.out.printf("%d%n is the smallest", number3);
        }

}
}
	