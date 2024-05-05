import java.util.Scanner;
import java.util.Arrays;
	
	public class ArrayNameAndGrade{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);



	int counter = 0;
	int totalScore = 0;


	String [] studentNames = new String[5];
	int [] studentgrades = new int[5];


	for (int x = 0; x < 5; x++){


	System.out.print("Enter student name:");
	String studentName = input.next();
	studentNames[x] = studentName;


	System.out.print("Enter grade:");
	int studentgrade = input.nextInt();
	studentgrades[x] = studentgrade;

	}

	for (int y = 0; y < 5; y++){

	System.out.print("\n");

	System.out.printf("%s%s\n","Students name:", studentNames[y]);
	System.out.printf("%s%d\n","Students grade:", studentgrades[y]);

	System.out.print(" ");
	
	}
 
	
	
 





	




}

}