import java.util.Scanner;
import java.util.Arrays;
	
	public class ArrayAge{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int counter = 0;


	int [] ageA = new int[5];

	for (int x = 0; x < 5; x++){

	System.out.print("enter age:");
	int age = input.nextInt();


	ageA[x] = age;
	
	counter++;
	}


	System.out.println("");
	System.out.println(ageA[0]);
	System.out.println("");

	System.out.println(ageA[1]);
	System.out.println("");

	System.out.println(ageA[2]);
	System.out.println("");

	System.out.println(ageA[3]);
	System.out.println("");

	System.out.println(ageA[4]);
	System.out.println("");


	



	




}

}