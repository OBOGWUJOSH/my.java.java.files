import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("input amount of water in KG: ");
	double waterMass = input.nextDouble();

	
	System.out.print("initial temprature of water: ");
	double initialWaterTemprature = input.nextDouble();
	
	
	System.out.print("final temprature of water: ");
	double finalWatertemprature = input.nextDouble();

	Double requiredEnergy = waterMass * (finalWatertemprature-initialWaterTemprature) * 4184;

	System.out.println(requiredEnergy);
	
	
}

}