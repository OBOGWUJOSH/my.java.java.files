import java.util.Arrays;
import java.util.Scanner;
	public class CreditCardScanner{
	public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	int count = 0;
	
	int counter = 0;

	int lengthOfString = 0;

	String creditcardnumber;
	
	int stringtoIndex0 = 0;
	
	int stringtoIndex1 = 0;
	

		System.out.println("Kindly input your creditcard number for Validation:  ");
		creditcardnumber = input.nextLine();





		lengthOfString = creditcardnumber.length();

		int [] ArrayOfcreditcardnumber = new int [lengthOfString];
	
		

			if (lengthOfString ==13 || lengthOfString ==16){

				System.out.println("card length:" + lengthOfString );
			}

			
			else 
			System.out.println("invalid card length");

		
		




		for (int x = 0; x < lengthOfString; x++){

		stringtoIndex0 = creditcardnumber.charAt(0) - '0';
		stringtoIndex1 = creditcardnumber.charAt(1) - '0';	

		}count++;
			
		



			if (stringtoIndex0 == 4){

				System.out.printf("Credit Card Type: "+"Visa Card.");
			}

			else
			if (stringtoIndex0 == 5){

				System.out.printf("Credit Card Type: "+"Master Card.");
			}

			else
			if (stringtoIndex0 == 6){

				System.out.printf("Credit Card Type: "+"Discover Card.");
			}

			else
			if (stringtoIndex0 == 3 && stringtoIndex1 == 7){

				System.out.printf("Credit Card Type: "+"American Express Card.");
			}	

			else {System.out.printf("Credit Card Type: "+"Invalid card.");}





		int sumOfCardNumber = 0;

		int [] stringtoIndex12 = new int[lengthOfString];
		int [] stringtoIndex15 = new int[lengthOfString];


		int [] multiplicationOfstringtoIndex12 = new int [lengthOfString];
		int [] multiplicationOfstringtoIndex15 = new int [lengthOfString];





		for (int x = lengthOfString - 1 ; x >= 0; x-=2){


			stringtoIndex12[x] = creditcardnumber.charAt(x) - '0';
			stringtoIndex15[x] = creditcardnumber.charAt(x) - '0';

		}count++;


		//System.out.println(Arrays.toString(stringtoIndex12));





		
		for (int x = 0 ; x < lengthOfString; x++){

			multiplicationOfstringtoIndex12[x] = stringtoIndex12[x] *2 ;
			multiplicationOfstringtoIndex15[x] = stringtoIndex15[x] *2 ;

			}counter++;


		System.out.println(Arrays.toString(multiplicationOfstringtoIndex12));
	
	





		
		//System.out.println(stringtoNumber0);
		//System.out.println(stringtoNumber1);
		//System.out.println(Arrays.toString(ArrayOfcreditcardnumber));




}

}

