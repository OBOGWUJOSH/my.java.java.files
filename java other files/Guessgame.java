import java.util.Scanner;
   public class GuessGame {
    public static void main(String[] arg){
	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to the GuessGame");

	System.out.print("How many times do you want to play: ");
	int userInput1 = input.nextInt();




	for (int inp = 1; inp <= userInput1; inp++){
		

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
					break;

				}
		}
	

    }

   }
