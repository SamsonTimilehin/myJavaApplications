package chapterSix;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of Asterisks row and column");
        num = scanner.nextInt();
        displayAsterisks(num);

    }
    public static void displayAsterisks(int number){
       for(int i = 0; i<number; i++){
           for(int j = 0; j<number; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
