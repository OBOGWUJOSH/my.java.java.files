import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("mile driven: ");
	int milesDriven = input.nextInt();

	System.out.print("gallon used: ");
	int gallonUsed = input.nextInt();

	double calculateTheMilesPerGallon = (((double)milesDriven)/gallonUsed);

	System.out.printf("%.3f",calculateTheMilesPerGallon);

}

}