import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
      	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance : ");
	double balance = input.nextDouble();

	System.out.print("Enter anualInterest : ");
	double anualInterest = input.nextDouble();

	double devideAnualInterest = anualInterest/1200;
	
	double interests = balance * devideAnualInterest;

	System.out.printf("%.5f",interests);
	
    	

    }


}