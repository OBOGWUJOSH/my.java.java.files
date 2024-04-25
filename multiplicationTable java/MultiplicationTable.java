//multiplication table


public class MultiplicationTable{
public static void main(String[] args){

	

	for (int y = 1; y < 13; y++){
		for (int x = 1; x < 13; x++){

		System.out.printf("\t%d%s%d%s%d\t ", y, "x", x, "=" , (y * x));
		

		}System.out.println(" ");
	}
} 


}

  