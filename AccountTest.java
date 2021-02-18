 import java.util.Scanner;

 public class AccountTest{

 public static void main(String [] args){

 Account joyAccount = new Account("Samson", 5000.00);

 System.out.println("How much will you like to deposit?");

 Scanner input = new Scanner(System.in);

  double depositAmount = input.nextDouble();

  System.out.println("How much will you like to withdraw?");

  double withdrawAmount = input.nextDouble();

  joyAccount.deposit(depositAmount);
 
  joyAccount.withdrawal(withdrawAmount);

  System.out.printf("Hello, %s%n",joyAccount.getName());
  System.out.println("Your account balance is " + joyAccount.getBalance());



}









}