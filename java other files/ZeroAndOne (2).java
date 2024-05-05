import java.util.Scanner;
   public class ZeroAndOne {
    public static void main(String[] arg){
	Scanner Input = new Scanner(System.in);

	System.out.println("Welcome to the ZeroAndOneGame");

	System.out.println("How many times do you want to play: ");
	int userInput1 = Input.nextInt();
	
	

	
	int counter = 0;

	while (counter < userInput1) {

	System.out.println("enter number: ");
	int userInput = Input.nextInt();
	

	if
	(userInput == 0){System.out.println(1);}
 
	else if 
	(userInput == 1){System.out.println(0);}

	counter=counter+1;


	}


		
	
    }
}



	//if (userInput > 1);{System.out.println("invalid Number");}
	//if (userInput < 0);{System.out.println("invalid Number");}
	
