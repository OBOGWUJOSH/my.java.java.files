import java.util.Arrays;
import java.util.Scanner;
	public class BackToSender{
	public static void main(String[] args){
 
	Scanner input = new Scanner(System.in);

	String Dispatcher1 = ("Dayo");
	String Dispatcher2 = ("Dami");
	String Dispatcher3 = ("tunde");
	String Dispatcher4 = ("Emeka");

	int packageGivenPerDay = 100;
	int basePay = 5000;
	
	int counter = 0;


	System.out.println("how many deliveries the rider make today day:  ");
	int numberOfDelivery = input.nextInt();

	if (numberOfDelivery >= 70){
		
		int wageForTheDay = (numberOfDelivery * 500) + 5000;
		System.out.println("Your wages for the day is:N" + wageForTheDay);
	}
	
	else
	if (numberOfDelivery >= 60){
		
		int wageForTheDay = (numberOfDelivery * 250) + 5000;
		System.out.println("Your wages for the day is:N" + wageForTheDay);
	}

	else
	if (numberOfDelivery >= 50){
		
		int wageForTheDay = (numberOfDelivery * 200) + 5000;
		System.out.println("Your wages for the day is:N" + wageForTheDay);
	}


	else if
	(numberOfDelivery < 50){
		
		int wageForTheDay = (numberOfDelivery * 160) + 5000;
		System.out.println("Your wages for the day is:N" + wageForTheDay);
			

	}

	



	/*for(int x = 0; x <= 16; x++){
			
	System.out.println("write your account:  ");
	accountNumber = input.nextInt();

	accountNumbers[x] = String;
	}*/

	


}

}

