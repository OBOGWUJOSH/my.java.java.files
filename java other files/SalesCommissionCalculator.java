import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("EnterSalesInputForTheWeek: ");
	double salesInput = input.nextDouble();

	double ninePercent = (9/100f);
	double inputOfNinePercent = (salesInput * ninePercent + 200);

	System.out.printf("$%.1f",inputOfNinePercent);

    }


}
