import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: "); 
	int number1 = input.nextInt();

	int square = number1 * number1;
	
	if(number1 > 100) 
	{
	System.out.println("it is greater than 100");
	} 
	else {System.out.println("It is less than 100"); }
	
	if(square > 100) {
	System.out.println("Squared number is greater than 100");
	} 
	else { System.out.println("squared number is less than 100"); }
	
	if(number1 == 100) 
	{System.out.println("number is equal to 100");}
	else {
        System.out.println("number is not equal to 100"); }

	if(square == 100)
	{System.out.println("squared number is equal to 100");}
	else {
        System.out.println("squared number is not equal to 100"); }

    }
}
	
	
	
        
