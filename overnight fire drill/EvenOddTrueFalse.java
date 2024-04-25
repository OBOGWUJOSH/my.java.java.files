//EvenOddTrueFalse

import java.util.Arrays;
import java.util.Scanner;
public class EvenOddTrueFalse{
public static void main(String[] args){
	


	int [] numbers = new int[]{4,5,8,5,3,6};

	boolean [] emptyNumbers = new boolean[numbers.length];

	int counter = 0;



	
	for(int x = 0; x < numbers.length; x++){
	
	if (numbers[x]%2 == 0){
	
	emptyNumbers[x] = true;
	}


	else 
	emptyNumbers[x] = false;

	counter++;
	

	}System.out.print(Arrays.toString(emptyNumbers));

	

}

}  