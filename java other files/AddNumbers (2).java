public class AddNumbers {
	public static int addNumbers(int firstNumber,int secondNumber){
		int ans = firstNumber + secondNumber;
		return ans;

	}

	public static int MultiplyAdd(int firstNumber,int secondNumber,int thirdNumber){
		int multiply = (firstNumber * secondNumber) + thirdNumber;
		return multiply;

	}

	public static int AddAddAddAdd(int firstNumber,int secondNumber,int thirdNumber,int forthNumber){
		int AddAddAddAdd = firstNumber + secondNumber + thirdNumber + forthNumber;
		return AddAddAddAdd;
	}


	public static void main(String[] args){

		int sum = AddAddAddAdd(3,4,5,10);
		System.out.print(sum);
	}

}






