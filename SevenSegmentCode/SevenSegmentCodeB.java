import java.util.Scanner;
public class SevenSegmentCodeB{
public static void main(String[] args){


Scanner input = new Scanner(System.in);

int number = 0;

while( number != -1){
System.out.print("Enter a number: ");
number = input.nextInt();



switch(number){

a	 b		c		d		e		f		g	  h

1	- 1   - 	1 	- 	1 	- 	1 	- 	1	 - 	1 	- (1)
___	- \n| - 	|	-	___	-	|	-	\n|	 -	___




//System.out.print(" ___\n|   |\ n|___|\n|   |\n|___|\n");


break;

//case 1: System.out.print("\t|\n\t|\n\t|\n");
break;

case 2: System.out.print(" ___\n    |\n ___|\n|\n|___\n");
break;

case 3: System.out.print("___\n   |\n___|\n   |\n___|\n");
break;

case 4: System.out.print("|\n|___|\n    |\n    |\n");
break;

case 5: System.out.print(" ___\n|\n|___\n    |\n____|\n");
break;

case 6: System.out.print(" ___\n|\n|___\n|   |\n|___|\n");
break;

case 7: System.out.print("___\n   |\n   |\n   |\n");
break;

case 8: System.out.print(" ___\n|   |\n|___|\n|   |\n|___|\n");
break;

case 9: System.out.print(" ___\n|   |\n|___|\n    |\n    |\n");


}
}
}