 public class DateTest{

   
  public static void main(String [] args){
  
  Date dateSetting = new Date( 05, 19, 2020);
  
  dateSetting.setMonth(02);
  dateSetting.setDay(18);
  dateSetting.setYear(2021);
  
  dateSetting.getMonth();
  dateSetting.getDay();
  dateSetting.getYear();
  
  System.out.printf("TODAY'S DATE %n%s",dateSetting.displayDate());

}









}