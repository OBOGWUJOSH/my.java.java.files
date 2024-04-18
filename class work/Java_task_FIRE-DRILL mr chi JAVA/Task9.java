	import java.util.Scanner;
	public class Task9{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int number = 1;
	int x = 0;
	int number4 = 4;
	int number8 = 8;
	int count = 1;
	int count1 = 1;
	int Addnumber4 = 0;
	int Addnumber8 = 0;



	for (x = 4; x <= 10; x+=4){
	
	for (int i = 1; i<=5; i++){

		System.out.print(x);
		
	}counter++;
	}
	
	System.out.println(" ");
	

	if (count == 1){
		for (int i = 0; i< 5; i++){
		count = number4 * count;
		System.out.print(count + " ");
		
		}
		
		
	
	}

	System.out.println(" ");

	if (count1 == 1){
		for (int i = 0; i< 5; i++){
		count1 = number8 * count1;
		System.out.print(count1 + " ");
		}	
	}

	System.out.println(" ");
	System.out.println(" ");

	Addnumber4 = (4 + 16 + 64 + 256 + 1024);
	Addnumber8 = (8 + 64 + 512 + 4096 + 32768);

	System.out.println(Addnumber4 + " ");
	System.out.println(Addnumber8 + " ");
	


	System.out.println(" ");

	int additionOfSum = (Addnumber4 + Addnumber8);

	System.out.println(additionOfSum);

	System.out.println(" ");

	int Square = 38812 * 38812;

	System.out.println(Square);

	



}
}
