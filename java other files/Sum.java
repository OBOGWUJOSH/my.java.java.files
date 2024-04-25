import java.util.Scanner;
    public class Sum {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	  
	double firstNumber = input.nextDouble();

	System.out.print ("second number: ");
	double secondNumber = input.nextDouble();

	//double x = (firstNumber);
	//double y = (secondNumber);
	

	double sum = (firstNumber + secondNumber);

	double average = ((firstNumber + secondNumber)/2);

	double product = (firstNumber * secondNumber);



	System.out.printf("The sum of%3f", "firstNumber", "and", "secondNumber\s is", sum);
	System.out.println("The average of:\s" + average);
	System.out.println("The product of:\s" + product);



     }
     }