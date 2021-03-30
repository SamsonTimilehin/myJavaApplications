package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int totalMiles = 0;
        int totalGallons = 0;
        int milesCounter = 0;
        int gallonCounter = 0;

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles covered");
        int milesValue = scan.nextInt();

        while (milesValue != 0) {
            totalMiles += milesValue;
            milesCounter++;

            System.out.println("Enter Number of gallons used");
            int gallonsUsed = input.nextInt();
            if (gallonsUsed != 0) {
                totalGallons += gallonsUsed;
                gallonCounter++;
                System.out.println("Enter milesValue or 0 to quit");
                milesValue = scan.nextInt();
            }
        }
        double averageMiles = (double)totalMiles/milesCounter;
        System.out.printf("Total miles covered is %d%nAverage is %f" ,totalMiles ,averageMiles);

        double averageGallon = (double) totalGallons/gallonCounter;
        System.out.printf("%n%nTotal gallons used is %d%nAverage is %f",totalGallons,averageGallon);
    }

}
