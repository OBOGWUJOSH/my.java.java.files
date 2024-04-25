//OneZeroOne

import java.util.Arrays;
import java.util.Scanner;
public class OneZeroOne{
public static void main(String[] args){
	


	int [] numbers = new int[]{4,5,8,5,3,6};

	int [] emptyNumbers = new int[numbers.length];

	int counter = 0;



	
	for(int x = 0; x < numbers.length; x++){
	
	if (numbers[x]%2 == 0){
	
	emptyNumbers[x] = 0;
	}



	else 
	emptyNumbers[x] = 1;

	counter++;
	



	}System.out.print(Arrays.toString(emptyNumbers));

	

}

}  