//Task12
import java.util.Arrays;
public class Task12{
public static void main(String...args){


	int [] numberElement = new int [10];
	
	int [] numberInArray = {23,34,5,35,56,36,54,29,88,76};


	numberElement = FunctionArrayIndex.taskTwelve(numberInArray);

	System.out.println(Arrays.toString(numberElement));

}

}