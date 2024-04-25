import java.util.Scanner;
import java.util.Arrays;

	public class ArrayWithoutLoop{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;


	String [ ] studentNames = new String[5];



	System.out.println("Enter students names: ");
	String studentNames1 = input.nextLine();

	studentNames[0] = studentNames1;

	System.out.println("Enter students names: ");
	String studentNames2 = input.nextLine();

	studentNames[1] = studentNames2;

	System.out.println("Enter students names: ");
	String studentNames3 = input.nextLine();

	studentNames[2] = studentNames3;

	System.out.println("Enter students names: ");
	String studentNames4 = input.nextLine();

	studentNames[3] = studentNames4;


	System.out.println("Enter students names: ");
	String studentNames5 = input.nextLine();
	
	studentNames[4] = studentNames5;


	System.out.println(Arrays.toString(studentNames));









	

	//for (int x = 0; x < 5; x++ ) {

	//System.out.println("Enter students names: ");
	//String studentNames = input.nextLine();

	//}counter++;


	
	//String [ ] studentNames = new String[5];
	


	//System.out.println(Arrays.toString(studentNames));







	








}



}
