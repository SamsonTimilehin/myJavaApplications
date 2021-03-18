package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputAndAddition {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want in your array");
         Scanner input = new Scanner(System.in);
        int arrayNumber = input.nextInt();


        int [] arraySize = new int[arrayNumber];

         System.out.println("Enter one by one");
        int sum = 0;
        for (int counter = 0 ; counter < arrayNumber; counter++){
        arraySize[counter] = input.nextInt();
         sum += arraySize[counter];

         }
        System.out.println("Elements of array are " + Arrays.toString(arraySize));
        System.out.println("Sum is " + sum);
    }
}
