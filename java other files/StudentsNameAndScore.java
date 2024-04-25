import java.util.Scanner;
  public class StudentsNameAndScore {
    public static void main(String []arg) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("students name:  ");
	String stuName = input.nextLine();

	System.out.print("students scored:  ");
	int scores = input.nextInt();

	System.out.print("students scored:  ");
	int scores1 = input.nextInt();

	System.out.print("students scored:  ");
	int scores2 = input.nextInt();

	//if (scores > 100);

		//System.out.println("invalid score cannot calculate");
	


	//if (scores1 > 100);
		
		//System.out.println("invalid score cannot calculate");





        
	int x = (scores + scores1 + scores2);
	
	if
	 (x > 100)
		{System.out.printf("invalid score cannot calculate %2d", x );
		}

	if
	 (x < 100){
		System.out.println(stuName);
		System.out.printf("your score is %2d", x );
		}

		//System.out.println(x);
	

	//if
	//(x < 50);
		//else 
		//System.out.printf("you failed because your score is %2d", x );
		
		
 }



}
		   