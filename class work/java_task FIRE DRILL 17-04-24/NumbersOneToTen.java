import java.util.Arrays;
import java.util.Scanner;
	public class NumbersOneToTen{
	public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	
	int[] numbers = new int[10];

	
	for(int x = 0; x < 10; x++){

	
			
	System.out.println("write a number:  ");
	int number= input.nextInt();
	numbers[x] = number;

	}
	System.out.println(Arrays.toString(numbers));


}
}



