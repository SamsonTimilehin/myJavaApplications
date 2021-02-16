   public class Account{

   private String name;

   private double balance;

   public Account(String name, double balance){

     this.name = name;

     this.balance = balance; 

}

   public void deposit(double depositAmount){

     if(depositAmount > 0.00)

      balance += depositAmount;       
}

   public void withdrawal(double withdrawAmount){

      if(withdrawAmount > 0.00)	

       balance -= withdrawAmount;
}
   public void setName(String name){
  
      this.name = name;
}

  public String getName(){

  return name;
}

  public double getBalance(){

  return balance;

}






}