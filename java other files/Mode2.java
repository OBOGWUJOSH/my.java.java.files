import java.util.Arrays;
public class Mode2{
public static void main(String[] args){

	int [] numbers = {1,3,3,2,4};
	int counter = 0;
	int countertwo = 0;
	int x = 0;
	int y = 0;
	int number = 0;

		for (counter = 0; counter <= 4; counter++){

			for (countertwo = 0; countertwo <= 4; countertwo++){


				if(numbers[0 + counter] == numbers[0 + countertwo]){

				number = numbers[0 + countertwo];
		
				counter++;
				}

			}

		}
		//System.out.print(Arrays.toString(numbers));
		System.out.print(number);
		
		

	



}
	

} 


