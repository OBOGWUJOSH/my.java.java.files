import java.util.Scanner;
import java.util.Arrays;
	
	public class ArrayNameAndGradeAndAverage{
	public static void main(String[] args){


	Scanner input = new Scanner(System.in);



	int counter = 0;
	int totalScore = 0;
	int studentgrade = 0;
	double averagecalculation = 0;
	


	String [] studentNames = new String[5];
	int [] studentgrades = new int[5];



	for (int x = 0; x < 5; x++){



	System.out.print("Enter student name:");
	String studentName = input.next();
	studentNames[x] = studentName;


	System.out.print("Enter grade:");
	studentgrade = input.nextInt();
	studentgrades[x] = studentgrade;


	totalScore += studentgrades[x];

	averagecalculation = totalScore/5;
	}





	System.out.printf("%s \t %s", "Students", "Scores");

	for (int y = 0; y < 5; y++){

	System.out.print("\n");

	System.out.printf("%s \t \t %d",studentNames[y],studentgrades[y]);
	
	System.out.println(" ");

	}



	System.out.printf("%s%d \n","Total scores of student:", totalScore);

	System.out.printf("%s%.2f","Average score:", averagecalculation);
 
 




}

}