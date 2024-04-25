import java.util.Scanner;
  public class CustomerCare {
    public static void main(String []arg) {
	

	String prompt = """
    
	Hello Welcome 
	To Listen in your prefared language 
	Press
	1 -> English
	2 -> French
	3 -> German
	""";

	String englishPrompt = """
	1 -> speakEnglish
	2 -> loveEnglish
	3 -> marryEnglish
	""";
	
		String EenglishPrompt = """
		1 ->learn to say hello in english
		2 ->learn to say hi english
		3 ->learn to say i love you english

		""";

	String frenchPrompt = """
	1 -> speakFrench
	2 -> loveFrench
	3 -> marryFrench
	""";

	String GermanPrompt = """
	1 -> speakGerman
	2 -> loveGerman
	3 -> marryGerman
	""";

    
    
    

	System.out.print(prompt);
	Scanner KeyboardInput = new Scanner(System.in);
	int userInput = KeyboardInput.nextInt();
	

	switch (userInput) {
		case 1-> {
			System.out.println("English");

			System.out.println(englishPrompt);
			KeyboardInput = new Scanner(System.in);
			int enInput = KeyboardInput.nextInt();
			

				switch (enInput) {
					case 1->{
						System.out.println("speakEnglish");

						System.out.println(EenglishPrompt);
						KeyboardInput = new Scanner(System.in);
						int spengEnglish = KeyboardInput.nextInt();
						
						switch (spengEnglish){
						case 1 -> System.out.println("learn to say hello in english");
						case 2 -> System.out.println("learn to say hi english");
						case 3 -> System.out.println("learn to say i love you english");
						

						}
					}
				}	


				switch (enInput) {
					case 2->{
						System.out.println("loveEnglish");

						System.out.println(EenglishPrompt);
						KeyboardInput = new Scanner(System.in);
						int lovespEnglish = KeyboardInput.nextInt();
						
						switch (lovespEnglish){
							case 1 -> System.out.println("i love you in english");
							case 2 -> System.out.println("learn a new love language in english");
							case 3 -> System.out.println("how i love to love your english");
						

						}
					}
				}

				switch (enInput){
					case 3 ->{
						System.out.println("marryEnglish");

						System.out.println(EenglishPrompt);
						KeyboardInput = new Scanner(System.in);
						int spengEnglish = KeyboardInput.nextInt();
						
					switch (spengEnglish) {
						case 1 -> System.out.println("learn to say hello in english3");
						case 2 -> System.out.println("learn to say hi english3");
						case 3 -> System.out.println("learn to say i love you english3");
						

						}
					}
				}
		}
	}


	switch (userInput) {
		case 2 -> {
			System.out.println("French");

			System.out.println(frenchPrompt);
			KeyboardInput = new Scanner(System.in);
			int frInput = KeyboardInput.nextInt();
			
			switch (frInput) {

				case 1 ->System.out.println("speakFrench");


				case 2 ->System.out.println("loveFrench");
		

				case 3 ->System.out.println("marryFrench");
			
 
				default ->System.out.println("u no well");
			
				
				};
		}
	}

	switch (userInput) {
		case 3 -> {
			System.out.println("German");

			System.out.println(GermanPrompt);
			KeyboardInput = new Scanner(System.in);
			int gerInput = KeyboardInput.nextInt();
			switch (gerInput) {

				case 1 ->System.out.println("speakGerman");


				case 2 ->System.out.println("loveGerman");
		

				case 3 ->System.out.println("marryGerman");
			
 
				default ->System.out.println("u no well");
			
				
				};
		}
	}
































	
    }
    
  }
