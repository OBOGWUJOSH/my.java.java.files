  //Sorting 

import java.util.Arrays;
import java.util.Scanner;
	public class MultiplicationOfArray{
	public static void main(String[] args){


	int [] numbers = new int []{6,9,1,2,3};

	int [] multiples = new int [25];

	int counter = 0;
	int count = 0;
	int maxNumber = 0;
	
	
	for (int x = 0; x < numbers.length; x++){
	
		for (int y = 0; y < 5; y++){

		int maths = numbers [x] * numbers [y];

		multiples[counter] = maths;

		//System.out.printf("%d%s%d%s%d\n", numbers[x], "x", numbers[y], "=" , maths);
		
		counter+=1;
		}


		}
			for (int x = 0; x < multiples.length; x++){

			if (multiples[x] > maxNumber){
				
			maxNumber = multiples[x];
			
			
			}	
			
			}

			System.out.print(maxNumber);



	//System.out.print(Arrays.toString(multiples));

}


}
 