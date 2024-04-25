import java.util.Scanner;

public class Year {

    public static void main(String[] arg) {
	Scanner input = new Scanner(System.in);

	System.out.print("convert minutes to years: ");
	int  minutes = input.nextInt();

	double MultiplyToConvertToMinutes = 60;
	double MultiplyToConvertToYour = 24;
	double MultiplyToConvertToYears = 365;

	double ConstantToConvertToYear =  (60*24*365);
	double Converts = (minutes/ConstantToConvertToYear);
    	

	System.out.println(Converts);
	
    }



}