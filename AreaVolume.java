
  import java.util.Scanner;

  public class AreaVolume{

  public static void main(String [] args){
  
  double area;
  double length;
  double volume;
  double radius;

  Scanner input = new Scanner(System.in);

  System.out.print("Enter the radius of a cylinder: ");
  radius = input.nextDouble();

  area = radius * radius * 3.14;
  System.out.printf("The Area of is %f%n", area);

  System.out.print("Enter the length of a cylinder: ");
  length = input.nextDouble();

  volume = area * length;
  System.out.printf("The Volume is %f", volume);
  

  
  
 
}


}