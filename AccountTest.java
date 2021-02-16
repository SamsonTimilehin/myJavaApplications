 import java.util.Scanner;

 public class AccountTest{

 public static void main(String [] args){

 Account joyAccount = new Account("Samson", 5000.00);

 System.out.println("How much will you like to deposit?");

  Scanner input = new Scanner(System.in);

  double depositAmount = input.nextDouble();

  double withdrawAmount = input.nextDouble();

  joyAccount.deposit(depositAmount);

  System.out.println("How much will you like to withdraw?");

  joyAccount.withdrawal(withdrawAccount);

  String nameOfAccount = joyAccount.getName();

  System.out.printf("The account name is %s%n", nameOfAccount);
	System.out.println("The account balance is " + joyAccount.getBalance());



}









}