package chapterFour;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the radius of a Circle");
        double radius = userInput.nextDouble();

        System.out.printf("The Area is %f ", circleArea(radius));

    }
    public static double circleArea(double radius){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
