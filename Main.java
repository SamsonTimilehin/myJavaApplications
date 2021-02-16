  import java.util.Scanner;

   public class Main{

   public static void main(String[] arg){

  int guessNumber = 35;  

  System.out.println("Guess Number");

  Scanner input = new Scanner(System.in);

  int userNumber = input.nextInt();

  if (userNumber == guessNumber)

  System.out.println("You are correct");
  
  if(userNumber > guessNumber)

  System.out.println("Number High");

  if (userNumber < guessNumber)

  System.out.println("Number low");


   
}
 
}



