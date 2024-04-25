import java.util.Arrays;
import java.util.Scanner;
	public class Task3{
	public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	
	int[] numbers = new int[10];
	int number = 0;

	
	for(int x = 0; x < 10; x++){
			
	System.out.println("write a number:  ");
	number = input.nextInt();
	numbers[x] = number;

	}
	

	for(int y = 0; y < 10; y++){

	System.out.print(" ");
	System.out.print(numbers[y]);

	}
	

	
	


}
}



