   public class Employee{

   private String firstName;

   private String lastName;

   private double monthlySalary;

   public Employee(String firstName, String lastName, double monthlySalary){

   this.firstName = firstName;
   this.lastName = lastName;
   this.monthlySalary = monthlySalary;

}

   public void setFirstName(String firstName){
   this.firstName = firstName;
}

 public void setLastName(String lastName){
   this.lastName = lastName;
}  

 public void setMonthlySalary(double monthlySalary){
   this.monthlySalary = monthlySalary;
}  

  public double getYearlySalary(){
   return monthlySalary*12;
   
}
  public double getSalaryIncrement(){
    return monthlySalary * 12 + 0.10 * monthlySalary * 12;
}

   
  public String getFirstName(){
   return firstName;
}  

  public String getLastName(){
   return lastName;
}  

  public double getMonthlySalary(){
    return monthlySalary;
}  

}