package Chapter_Seven;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationInMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to reserve seats for FirstClass or 2 for Economy");
        int num= input.nextInt();
        boolean[] seat = new boolean[10];
        int counter = 0;
        while (counter < seat.length-5 ){
            if(num == 1){
                seat[counter]=true;
                System.out.println("Enter 1 to reserve seats for FirstClass or 2 for Economy");
                num= input.nextInt();
                counter++;
            }else break;

        }
        System.out.println("would you like to reserve for economy? press 2 or 3 to exit");
        int num1= input.nextInt();
        int counter1=5;
        while(counter1 > seat.length-6){
            if(num1 ==2){
                seat[counter1]=true;
                System.out.println("Enter 2 to reserve seat for Economy class");
                num1= input.nextInt();
                counter1++;
            }else break;
        }

        System.out.println(Arrays.toString(seat));


    }
}
