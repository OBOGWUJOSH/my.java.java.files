public class ArrayKata {

public static int maximumNum(int[] userInput) {
 	
		int largestNumber = 0;
		for(int i = 0;i < userInput.length;i++){
		if(userInput[i] > largestNumber) {
			largestNumber = userInput[i];}

		}	
		return largestNumber;
  }	


public static int minimumNum(int[] userInput) {
 	
		
		int largestNumber = 0;
		int smallestNumber = userInput[0];
		for(int i = 0;i < userInput.length;i++){
		if(userInput[i] > largestNumber) {
			largestNumber = userInput[i];}
		else {
			if( userInput[i] < smallestNumber) {
				smallestNumber = userInput[i];}
		     }

		}	
		return smallestNumber;
  
}


public static int sumOfArray(int[] userInput) {

	int total = 0;
	for(int count = 0;count < userInput.length;count++) {
		total += userInput[count];
	}
	return total;
}




public static int sumOfEvenArray(int[] userInput) {

	int total = 0;
	
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 0){
			total += userInput[count];}
	}
	return total;
}



public static int sumOfOddArray(int[] userInput) {

	int total = 0;
	
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 1){
			total += userInput[count];}
	}

	return total;
}
public static int[] maximumIn(int[] userInput) {
 	
	int largestNumber = 0;
	int smallestNumber = 0;
	for(int i = 0;i < userInput.length;i++){
	if(userInput[i] > largestNumber) {
		largestNumber = userInput[i];}
	else {
	if(userInput[i] < smallestNumber) {
		smallestNumber = userInput[i];}
	  }

	}	

	int[] smallestAndLargest = {largestNumber,smallestNumber};
     
	return smallestAndLargest;
  }	



public static int noOfOddArray(int[] userInput) {

	int total = 0;
	
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 1){
			total++;}
		}
	return total;
}





public static int noOfEvenArray(int[] userInput) {

	int total = 0;
	
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 0){
			total++;}
		}
	return total;
}




public static int[] evenNumbers(int[] userInput) {

	int total = 0;
	int[] evenNums = new int[5];
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 0){
			evenNums[count] = userInput[count];}
		}
		
	return evenNums;
}



public static int[] oddNumbers(int[] userInput) {

	int total = 0;
	int[] oddNums = new int[5];
		for(int count = 0;count < userInput.length;count++) {
			if(userInput[count] % 2 == 1){
				oddNums[count] = userInput[count];
				}
		}
		
	return oddNums;
}

public static int[] squareNumbers(int[] userInput) {

	int[] square = new int[5];
		for(int count = 0;count < userInput.length;count++) {
			for(int i = 1;i < userInput[count];i++) {
				if(i * i == userInput[count]) {
					square[count] = userInput[count];
					}
			  }
		 }
	return square;
}



}