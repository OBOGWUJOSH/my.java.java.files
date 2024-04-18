import java.util.Scanner;
public class Access{

   public static void main(String... args) {
     String prompt ="""
     Press 
     1 -> For English 
     2 -> For Yoruba 
     3 -> For Hausa
     """;

     System.out.println(prompt);

     Scanner keyboardInput = new Scanner(System.in);

     int userInput = keyboardInput.nextInt();
    
     switch(userInput) {
           case 1 -> System.out.println("English");

           case 2 -> System.out.println("Yoruba");

           case 3 -> System.out.println("Hausa"); 
           
           default -> System.out.println("Pick other Options!");
          } 

     String englishPrompt = """
     Press
     1 -> Advanced English
     2 -> Beginners English
     3 -> Complex English
     """;
    
     System.out.println(englishPrompt);
     
     Scanner keyboard = new Scanner(System.in);

     int Input = keyboard.nextInt();
    

     switch(userInput) {

               case 1 -> System.out.println("Advanced English");

               case 2 -> System.out.println("Beginners English");

               case 3 -> System.out.println("Complex English");
              
               default-> System.out.println("Pick other Options!");
             
       }
   }
 }