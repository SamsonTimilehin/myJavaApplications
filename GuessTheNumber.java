package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    private static final SecureRandom secureRandom = new SecureRandom();



    public static void main(String[] args) {


        int randomNumber = displayRandom();

        Scanner input = new Scanner(System.in);


        String playMore;
        do{
            System.out.println("Guess a number from 1 to 1000");

            int userInput = 0;
            while (userInput != randomNumber) {
                userInput = input.nextInt();

                if (userInput == randomNumber) {
                    System.out.println("CONGRATULATIONS! you won");
                } else if (userInput < randomNumber) {
                    System.out.println("Oop! Too Low. Try Again");
                } else
                    System.out.println("Oop! Too High. Try Again");


            }
            System.out.println("Press 'YES' to play again or 'NO' to exit game ");
            playMore = input.next();

        } while (playMore.equalsIgnoreCase("yes"));
        System.out.println("Bye Bye!");


    }
    public static int displayRandom(){
      return  1 + secureRandom.nextInt(3);
    }
}
