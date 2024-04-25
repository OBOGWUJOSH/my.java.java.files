import java.util.Scanner;
  public class PassMark {
    public static void main(String []arg) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("students scored:  ");
	int scores = input.nextInt();

	System.out.print("students scored:  ");
	int scores1 = input.nextInt();

	System.out.print("students scored:  ");
	int scores2 = input.nextInt();


	int x = (scores + scores1 + scores2);
	
	
	if (x >= 50) 
		System.out.printf("you passed because your score is %2d", x );
	if (x < 50)
		
		System.out.printf("you failed because your score is %2d", x );
		
		//{System.out.println(x);}
		   
			
	

}
}
	