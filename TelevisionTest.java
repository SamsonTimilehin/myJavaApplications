   public class TelevisionTest{   

   public static void main(String [] args){

  Television driveTelevision = new Television();
 
   driveTelevision.setProductName("SAMSUNG");
   driveTelevision.setIsOn(true);
   driveTelevision.setChannel(5);
   driveTelevision.setVolume(25);

   driveTelevision.getProductName();
   driveTelevision.getIsOn();
   driveTelevision.getChannel();
   driveTelevision.getVolume();

   System.out.printf("%n%s %s%n",driveTelevision.getProductName(),"TELEVISION");
   System.out.printf("Television is now on: %s%n",driveTelevision.getIsOn());
   System.out.printf("In Channel %d%n",driveTelevision.getChannel());
   System.out.printf("Volume.....%d",driveTelevision.getVolume());
}




}