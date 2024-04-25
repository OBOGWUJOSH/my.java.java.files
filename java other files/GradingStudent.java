import java.util.Scanner;
  public class GradingStudent {
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



	int x = (scores + scores1 + scores2);

	//System.out.println(x);

	System.out.println(stuName);
	

	System.out.println("your score is");
	
	System.out.println(x);

	//System.out.println("Grade");
	
	
	if
	 (x > 101){
		System.out.println("invalid score cannot calculate");
		}
		
		else if (x == 100) {
		System.out.printf("Great !!! %2d", x );
		}
		else if (x >= 80){System.out.println("A");
		} 
		else if (x >= 70){System.out.println("B");
		}
		else if (x >= 50){System.out.println("D");
		}
		else if (x >= 40){System.out.println("E");
		}
		else if (x < 40){System.out.println("F");
		}

	


	

		
		
		
		
 }



}

		   