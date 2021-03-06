package chapterFour;

import java.util.Scanner;

public class NegativePositiveNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double count = 0;
        while (count < 5) {
            System.out.println("Enter Number");
            int userInput = scan.nextInt();

            if(userInput < 0)
                System.out.printf("%d is a negative integer%n", userInput);
                if(userInput == 0)
                    System.out.printf("Integer zero%n");
                    if(userInput > 0)
                        System.out.printf("%d is a positive integer%n", userInput);
                         count++;



        }
    }
}
