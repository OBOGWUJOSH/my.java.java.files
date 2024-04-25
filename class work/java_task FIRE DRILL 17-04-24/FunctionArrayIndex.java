
public class FunctionArrayIndex{


public static int[] FunctionArrayIndex1(int[] numbers){

	int [] collect = new int[5];

	int counter = 0;

	for(int x = 0; x < 10; x+=2){

	collect[counter] = numbers[x];
	counter++;
	}
	
	return collect;

}




public static int[] odd(int[] numberss){

	int [] collectmin = new int[5];

	int counter = 0;

	for(int x = 1; x < 10; x+=2){

	collectmin[counter] = numberss[x];
	counter++;

	}
	
	return collectmin;
}




public static int tasksix (int[] numbers){
	
	int counter = 0;

	int sum2 = 0;



	for(int x = 0; x < 10; x+=2){

	sum2 += numbers[x];
	
	

	counter++;

	}

	return sum2;

}




public static int taskseven (int[] numberss){
	
	int counter = 0;

	int [] sumTotal = new int [5];

	int sum = 0;



	for(int x = 1; x < 10; x+=2){

	sumTotal[counter] = numberss[x];

	
	sum += sumTotal[counter];

	counter++;

	}

	return sum;

}




public static int taskEight (int[] numbers){
	
	int counter = 0;

	int maxmumNumber = numbers[0];
	int minimumNumber = numbers[0];
	



	for(int x = 0; x < 10; x+=2){

		if (numbers[x] < minimumNumber){

		 minimumNumber = numbers[x];
		
		}
	counter++;
	}

	return minimumNumber;

}




public static int taskNine (int[] numberss){
	
	int counter = 0;

	int minimumNumber = numberss[0];
	



	for(int x = 1; x < 10; x+=2){

		if (numberss[x] < minimumNumber){

		 minimumNumber = numberss[x];
		
		}
	counter++;
	}

	return minimumNumber;

	}





public static int taskTen (int[] numbers){
	
	int counter = 0;

	int maximumNumber = numbers[0];
	int minimumNumber = numbers[0];



	for(int x = 0; x < 10; x+=2){

		if (numbers[x] > maximumNumber){

		 maximumNumber = numbers[x];
	}

	counter++;
	
	}
	return maximumNumber;

}







public static int taskEleven (int[] numberss){
	
	int counter = 0;

	int maximumNumber = numberss[0];



	for(int x = 1; x < 10; x+=2){

		if (numberss[x] > maximumNumber){

		 maximumNumber = numberss[x];
		
	counter++;

	}
	}
	return maximumNumber;

}



public static int[] taskTwelve (int[] numberInArray){
	
	int counter = 0;
	int counter2 = 0;

	int [] numberElement = new int[10];

	


	for (int x = 1; x < 10; x += 2){

	numberElement[x] = numberInArray[counter+2];

	counter++;
	}




	/*for (int y = 0; y < 10; y += 2){

	numberElement[y] = numberInArray[counter];

	counter++;
	}*/

	return numberElement;

	}










}


