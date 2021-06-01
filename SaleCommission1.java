package chapterSeven;



import java.util.Scanner;

public class SaleCommission1 {

    public static void main(String[] args) {


            
        int totalEarnings;
        Scanner input = new Scanner(System.in);

            System.out.println("How many times will you like to input gross sales");
            int numberOfInput = input.nextInt();
            int[] arrayItems = new int[numberOfInput];

            for (int i = 0; i < numberOfInput; i++) {
                System.out.println("Enter Sales person's gross sales");
                int grossSales = input.nextInt();
                totalEarnings = (int) (200 + (0.09 * grossSales));

                if (totalEarnings >= 200 && totalEarnings <= 299) {
                    ++arrayItems[0];
                } else if (totalEarnings >= 300 && totalEarnings <= 399) {
                    ++arrayItems[1];
                } else if (totalEarnings >= 400 && totalEarnings <= 499) {
                    ++arrayItems[2];
                } else if (totalEarnings >= 500 && totalEarnings <= 599) {
                    ++arrayItems[3];
                } else if (totalEarnings >= 600 && totalEarnings <= 699) {
                    ++arrayItems[4];
                } else if (totalEarnings >= 700 && totalEarnings <= 799) {
                    ++arrayItems[5];
                } else if (totalEarnings >= 800 && totalEarnings <= 899) {
                    ++arrayItems[6];
                } else if (totalEarnings >= 900 && totalEarnings <= 999) {
                    ++arrayItems[7];
                } else ++arrayItems[8];
            }
            System.out.printf("%s%20s%n", "Total", "Counter");
            System.out.printf("%s%10d%n%s%10d%n%s%10d%n%s%10d%n%s%10d%n%s%11d%n%s%10d%n%s%10d%n%s%7d", "$200 - $299", arrayItems[0], "$300 - $399", arrayItems[1], "$400 - $499", arrayItems[2], "$500 - $599", arrayItems[3], "$600 - $699", arrayItems[4], "$700 - 799", arrayItems[5], "$800 - $899", arrayItems[6], "$900 - $999", arrayItems[7], "$1000 and Over", arrayItems[8]);
    }
}
