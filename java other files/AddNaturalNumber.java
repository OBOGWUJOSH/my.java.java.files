//AddNaturalNumber-DONE
import java.util.Scanner;
	public class AddNaturalNumber {
	public static void main(String[] args){

	Scanner input = new Scanner (System.in);

	int x = 0;
	
	for (int newnumber=0; newnumber<10; newnumber++){
	System.out.println("input number: ");
	int input1 = input.nextInt();

	x = x + input1;
	}
	
	System.out.println(x);

	


}
}