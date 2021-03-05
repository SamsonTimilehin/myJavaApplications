package chapterFour;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = input.nextInt();
        if(firstNumber % secondNumber == 0){
            System.out.printf("%d is a multiple of %d",firstNumber, secondNumber);
        }
            System.out.printf("%d is not a multiple of %d",firstNumber, secondNumber);

    }
}
