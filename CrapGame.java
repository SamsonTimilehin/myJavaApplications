package Chapter_Six;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static int bankBalance = 1000;

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter Wager");
       int inputWager = input.nextInt();



        while(inputWager != 0) {

            if(bankBalance == 0){
                System.out.println("Sorry, you busted!  Insufficient bank balance");
                break;
            }

            if (inputWager > bankBalance){
                System.out.println("Wager is greater than your bank Balance");
                inputWager = input.nextInt();
            }


            int myPoint = 0;
            Status gameStatus;
            int sumOfDice = rollDIce();

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }
            if (gameStatus == Status.CONTINUE) {
                System.out.println(displayChatter());
                sumOfDice = rollDIce();
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                }  if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
            if (gameStatus == Status.WON) {
                bankBalance += inputWager;
                System.out.println("Player wins");
                System.out.println("Current bank Balance after winning is: " + bankBalance);
            } else {
                bankBalance -= inputWager;
                System.out.println("Player loses");
                System.out.println("Your Current bank Balance after losing is: " + bankBalance);
            }
            System.out.println("Enter wager to play more games");
            inputWager = input.nextInt();
        }
    }

    public static int rollDIce(){
        int die1 = 1+randomNumbers.nextInt(6);
        int die2 = 1+randomNumbers.nextInt(6);
        int sum = die1+die2;
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);
        return sum;
    }
    public static String displayChatter(){
        String [] chatter = {"Oh,you're going for broke, huh?", "Awc'mon,take a chance!", "You're up big", "Now's the time to cash in your chips!"};
        int rand = randomNumbers.nextInt(4);
       return chatter[rand];
    }
}
