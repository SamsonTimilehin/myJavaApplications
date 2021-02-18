  public class EmployeeTest{

  public static void main(String [] args){

  Employee firstEmployee = new Employee("Lola","Falola", 50000.00); 

  Employee secondEmployee = new Employee("Bola","Adeola", 60000.00); 

  firstEmployee.setFirstName("Kemi");
  firstEmployee.setLastName("Adeyemi");
  firstEmployee.setMonthlySalary(70000.00);

  secondEmployee.setFirstName("Taye");
  secondEmployee.setLastName("Olayemi");
  secondEmployee.setMonthlySalary(60000.00);

  System.out.printf("EMPLOYEE 1%n First Name: %s%n Last Name: %s%n Monthly Salary: %s%n%n",firstEmployee.getFirstName(),firstEmployee.getLastName(),firstEmployee.getMonthlySalary());
  System.out.printf("EMPLOYEE 2%n First Name: %s%n Last Name: %s%n Monthly Salary: %s",secondEmployee.getFirstName(),secondEmployee.getLastName(),secondEmployee.getMonthlySalary());
  
  System.out.printf("%n%nEMPLOYEE 1%n ANNUAL SALARY: %s",firstEmployee.getMonthlySalary()*12);
  System.out.printf("%n%nEMPLOYEE 2%n ANNUAL SALARY: %s",secondEmployee.getMonthlySalary()*12);

  System.out.printf("%n%nEMPLOYEE 1%n ANNUAL INCREMENT: %s",firstEmployee.getMonthlySalary()*12 + 0.10 * firstEmployee.getMonthlySalary()*12);
  System.out.printf("%n%nEMPLOYEE 2%n ANNUAL INCREMENT: %s",secondEmployee.getMonthlySalary()*12 + 0.10 * secondEmployee.getMonthlySalary()*12);

 
}








}