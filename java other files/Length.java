import java.util.Scanner;
    public class Length {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("input lenght: ");
	int length = input.nextInt();

	System.out.print("input acceleration: ");
	double acceleration = input.nextDouble();


	
	double calculatelenght = (length * length) / (2 * acceleration);

	System.out.print(calculatelenght);

    }

}