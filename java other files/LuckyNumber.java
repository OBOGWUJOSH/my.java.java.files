import java.util.Scanner;
   public class LuckyNumber {
    public static void main(String[] arg){
	Scanner Input = new Scanner(System.in);
		
	System.out.println("enter your number: ");
	int userInput = Input.nextInt();

	double lucknumber = (49000);

	if(userInput > lucknumber) {
				System.out.println("too high");
				}

	else
	if (userInput < lucknumber) {
				System.out.println("too low");
				}

	else 
	if (userInput == lucknumber) {
				System.out.println("CORRECT!!!");

				}
	

    }

   }
