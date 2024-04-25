import java.util.Scanner;
   public class GuessingGameAnswer {
    public static void main(String[] arg){
	Scanner Input = new Scanner(System.in);

	System.out.println("Welcome to the GuessGame");

	//System.out.print("How many times do you want to play: ");
	//int userInput1 = Input.nextInt();


	int lucknumber = 50000;
	int count = 0;	


	while (lucknumber == 50000){
		
	System.out.println("enter your number: ");
	int userInput = Input.nextInt();



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
