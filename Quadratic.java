  import java.util.Scanner;  

  public class Quadratic{

  public static void main(String [] args){
 
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the value for A: ");
  double a = input.nextDouble();

  System.out.print("Enter the value for B: ");
  double b = input.nextDouble();

  System.out.print("Enter the value for C: ");
  double c = input.nextDouble();

  
   double firstRoot = (-b + Math.sqrt(b*b-4*a*c))/2*a;

   double secondRoot = (-b - Math.sqrt(b*b-4*a*c))/2*a;

  System.out.printf("x1 = %f%nx2 = %f",firstRoot,secondRoot);


}


}