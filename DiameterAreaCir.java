package chapterFour;

import java.util.Scanner;

public class DiameterAreaCir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius value: ");
        double radius = input.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * ( radius * radius);

        System.out.printf("DIAMETER= %s%nCIRCUMFERENCE= %s%nAREA= %s", diameter, circumference, area);
    }
}
