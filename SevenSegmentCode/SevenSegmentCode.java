//SevenSegmentCode

import java.util.Arrays;
import java.util.Scanner;
public class SevenSegmentCode{
public static void main(String[] args){

	
	Scanner input = new Scanner (System.in);

	

	String [] firstArray = new String [8];
	
	String [] secondArray = {"_","|\n","|","_","\n|","|","_"};
	
	



	for (int x = 0; x < 8; x++){  

	System.out.print("Enter a binary combination of 8 digits:  ");
	char numberInput = input.nextChar();
	

	firstArray[x] = numberInput.split(" ");

	//firstArray[x] = Integer.toString(numberInput);

	int length = numberInput;



	firstArray[x] = Integer.toString(numberInput);

	length = firstArray.length;


	System.out.println(Arrays.toString(firstArray));
	//System.out.println(length);

	
		if (numberInput == 0 || numberInput == 1) {
			
			System.out.println("binary");

		}else {
			System.out.println("please input only binary");
				}


}





	/*
	numberInput.Index(1) =  secondArray[1];
	numberInput.Index(2) =  secondArray[2];
	numberInput.Index(3) =  secondArray[3];
	numberInput.Index(4) =  secondArray[4];
	numberInput.Index(5) =  secondArray[5];
	numberInput.Index(6) =  secondArray[6];
	numberInput.Index(7) =  secondArray[7];
	numberInput.Index(8) =  secondArray[8];*/



		
	


	//System.out.println(Arrays.toString(firstArray));

	//System.out.println(Arrays.toString(secondArray));





}

}