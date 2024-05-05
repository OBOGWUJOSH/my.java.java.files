public class SorttingInAssendingFunction{
public static int[] SorttingTest(int[] numbers){


	for (int y = 0; y < 5; y++){

		for (int x = 0; x < 5; x++){


			if (numbers [y] < numbers [x]){

	numbers [y] = numbers[y] + numbers [x];
	numbers [x] = numbers[y] - numbers [x];
	numbers [y] = numbers[y] - numbers [x];

			}

		}
	

	}

	return numbers;



}
}