import java.util.Scanner;
import java.util.Arrays;

	public class ArrayWithLoop{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;


	String[] studentnames = new String[5];



	for (int x = 0; x < 5; x++ ) {

	System.out.println("Enter students names: ");
	String studentNames = input.nextLine();

	studentnames[x]= studentNames;
	
	counter++;
	}
	
	
	


	System.out.println(Arrays.toString(studentnames));







	








}



}
