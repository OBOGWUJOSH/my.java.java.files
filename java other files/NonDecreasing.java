import java.util.Scanner;
 	public class NonDecreasing {
	public static void main(String []arg) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("first number:   ");
		int input1 = input.nextInt();

		System.out.println("second number:  ");
		int input2 = input.nextInt();

		System.out.println("third number:   ");
		int input3 = input.nextInt();

	
	




  	if(input1 > input2)
		{System.out.println(+ input1 + "is greater than" + input2 + "which is greater than" + input3);
			}
  	
	else
	if 
	(input2 > input1)
		{System.out.println(+ input2 + "is greater than" + input1 + "which is greater than" + input3);
			}
	
	else
	if (input1 > input3)
		{System.out.println(+ input1 + "is greater than" + input3 + "which is greater than" + input2);
			}



		
		}
}