import java.util.Scanner;
import java.util.Arrays;
	
	public class ArrayNames{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int counter = 0;


	String [] studentNameA = new String[5];

	for (int x = 0; x < 5; x++){

	System.out.print("enter name:");
	String studentName = input.nextLine();


	studentNameA[x] = studentName;
	
	counter++;
	}


	System.out.println("");
	System.out.println(studentNameA[0]);
	System.out.println("");

	System.out.println(studentNameA[1]);
	System.out.println("");

	System.out.println(studentNameA[2]);
	System.out.println("");

	System.out.println(studentNameA[3]);
	System.out.println("");

	System.out.println(studentNameA[4]);
	System.out.println("");


	



	




}

}