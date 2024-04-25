import java.util.Scanner;
	public class CollectAndArrangeNumber {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int positiveNumber = 0;
	int negativeNumber = 0;
	int zeroNumber = 0;
	


	

	System.out.println("Enter a number here: ");
	int newinput = input.nextInt();

	while (newinput!=1000){

		if (newinput > 0) {

			positiveNumber = positiveNumber + 1;
		}


		if (newinput < 0 ) {

			negativeNumber = negativeNumber + 1;
		}



		if (newinput == 0) {

			zeroNumber = zeroNumber + 1;
		}

	System.out.println("Enter a number here: ");
	newinput = input.nextInt();


	}

	System.out.printf("%s%d%n", "The positive numbers are",  positiveNumber);
	System.out.printf("%s%d%n", "The negative numbers are", "negativeNumber");
	System.out.printf("%s%d%n", "The number of zeros are ",  "zeroNumber");




}




}