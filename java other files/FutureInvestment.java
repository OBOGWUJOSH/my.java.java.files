import java.util.Scanner;
import java.lang.Math;
public class FutureInvestment {
    public static void main(String[] args) {
      	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment: ");
	double investment = input.nextDouble();

	System.out.print("Enter monthly interest rate : ");
	double monthlyInterest = input.nextDouble();

	System.out.print("number of years : ");
	double numberOfYears = input.nextDouble();

	
	 double a = (1 + monthlyInterest);
	 double b = (numberOfYears * 12);


	double futureInvestmentValue = investment * Math.pow(a,b);

	System.out.println(futureInvestmentValue);
	
    	

    }


}