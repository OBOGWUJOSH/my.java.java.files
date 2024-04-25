import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args); {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: "); 
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	int multiplication = number1 * number1;
	int multiplication2 = number2 * number2;

	int sum = multiplication + multiplication2;
	int sub = multiplication - multiplication2;

	System.out.printf("sum is %d%n", sum);
        System.out.printf("sub is %d%n", sub);
}
    }