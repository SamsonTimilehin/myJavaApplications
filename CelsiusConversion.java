
   import java.util.Scanner;

  public class CelsiusConversion{

  public static void main(String [] args){

   double celsius;

   System.out.print("Enter a degree in Celsius:");
  
   Scanner input = new Scanner(System.in); 

   celsius = input.nextDouble();

   double celsiusResult = celsius * 9.0/5 + 32;

  System.out.printf("(%f Celsuis is %f Fahrenheit",celsius,celsiusResult);


}




}

