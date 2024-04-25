import java.util.Arrays;
public class ArrayMinAndMaxNumber{
public static void main(String[] args){

	int [] numbers = {3,2,3,4,5,6,3,11,15,10};
	int minNumber = numbers[0];
	int maxNumber = numbers[0];

	for (int x = 0; x < 10; x++){
	if(maxNumber < numbers[x]) maxNumber = numbers[x];
	
	}
	for (int x = 0; x < 10; x++){
	if(minNumber > numbers[x]) minNumber = numbers[x];
	}
	System.out.printf("%s%d%n","The minNumber is ",minNumber);
	System.out.printf("%s%d%n","The maxNumber is ",maxNumber);


}

}