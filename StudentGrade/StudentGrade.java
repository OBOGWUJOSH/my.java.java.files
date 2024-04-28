//StudentGrade

import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
public static void main(String[] args){

	
	Scanner input = new Scanner (System.in);


	int count = 0;

	System.out.print("Number Of Students in class: ");
	int numberOfStudent = input.nextInt();

	System.out.print("Number Of Subjects : ");
	int numberOfSubject = input.nextInt();
	System.out.println("\n");

	
	String nameOfStudent = null;
	String nameOfSubject = null;
	int studentScore = 0;
	int [] arrNumberOfStudents = null;
	int [] arrNumberOfSubjects = null;
	String [] arrNameOfStudents = null;
	String [] arrNameOfSubjects = null;
	int [] arrStudentScores = null;


		arrNumberOfStudents = new int [numberOfStudent];
		arrNumberOfSubjects = new int [numberOfSubject];
		arrNameOfStudents = new String[numberOfStudent];
		arrNameOfSubjects = new String[numberOfSubject];
		arrStudentScores = new int [numberOfSubject];


		
	for(int x = 0; x < numberOfStudent; x++){
			System.out.println("Enter name of Student: " );
			nameOfStudent = input.next();
			arrNameOfStudents[0] = nameOfStudent;


			System.out.println("\n");




		for(int counter = 0; counter < numberOfSubject; counter++){

			System.out.print("Enter Name of Subject: " );
			nameOfSubject = input.next();
			arrNameOfSubjects[counter] = nameOfSubject;
			

		

			System.out.print("Enter Students score : " );
			studentScore = input.nextInt();
			arrStudentScores[counter] = studentScore;
	


				if (studentScore < 0 || studentScore > 100) {
				System.out.println("!!!! Illegal Student Score please Try again !!!!");
				}
			
		System.out.println("\n");
		}







		System.out.println(nameOfStudent);

		System.out.println(Arrays.toString(arrNameOfSubjects));

		System.out.println(Arrays.toString(arrStudentScores));

		System.out.println("\n");

	}



	



	

System.out.println("=======================================================================================================");
System.out.print("\n");

System.out.printf("%s\t\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "STUDENT","SUB1","SUB2","SUB3","TOT","AVE","POS");


System.out.println("======================================================================================================");
System.out.println("\n");
 

for (int y = 0; y < numberOfStudent; y++){

System.out.printf("%s\t\t %d\t %d\t %d\t", arrNameOfStudents[y],arrStudentScores[0],arrStudentScores[1],arrStudentScores[2]);
System.out.println("\n");

}






System.out.println("======================================================================================================");
System.out.println("\n");


	


	




		//System.out.println(nameOfStudent);

		//System.out.println(Arrays.toString(arrNameOfSubjects));

		//System.out.println(Arrays.toString(arrStudentScores));

		//System.out.println("\n");



	



	


		
	//System.out.print(NumberOfStudents);
	//System.out.println(Arrays.toString(numberOfStudents));







			
}

} 