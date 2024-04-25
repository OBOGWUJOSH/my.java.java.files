import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
      	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int Square = input.nextInt();

	double ConstantForConvertingToPing = 0.3025;
	
	double ValueInPing = Square * ConstantForConvertingToPing;

	System.out.println(ValueInPing);
	
    	

    }


}