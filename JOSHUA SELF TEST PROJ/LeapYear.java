//leapYear

import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){


Scanner input = new Scanner(System.in);
int year = 0;


System.out.println("Enter year: ");
year = input.nextInt();


	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
	System.out.println("is a leap year");
	}

	else{
	System.out.println("This year is not a leap year");

	
}

}

}

