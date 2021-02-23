   import java.util.Scanner;

  public class StudentGrade{

  public static void main(String [] args){

  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter Grade: ");

  double grade = input.nextDouble();

  if(grade > 100){
  System.out.print("Error!: Above score limit.");
}

 else if(grade >= 90){
  System.out.print("A");
}
  else if(grade >= 80){
  System.out.print("B");
}
  else if(grade >= 70){
  System.out.print("C");
}
  else{
  System.out.print("F");
}
}




}