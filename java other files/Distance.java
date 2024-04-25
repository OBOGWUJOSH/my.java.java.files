import java.util.Scanner;
public class Distance {

public static void main(String[] args){
    Scanner input =new Scanner (System.in);

    System.out.print("input velocity: ");
    double velocity = input.nextDouble();
    
    System.out.print("input time: ");
    double time = input.nextDouble();

    System.out.print("input acceleration: ");
    double acceleration = input.nextDouble();
	
    
    double newtonsEquation =  (1/2 * (acceleration *time)*(acceleration *time));

    System.out.println(velocity + newtonsEquation);

    

	


}


}