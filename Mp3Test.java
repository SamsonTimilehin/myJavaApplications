   public class Mp3Test{

   public static void main(String [] args){

   Mp3 drive = new Mp3();
  
   drive.setVolume(12);
   drive.setIsOn (true);
   drive.setPlaySound("Now Playing");

   drive.getVolume();
   drive.getIsOn();
   drive.getPlaySound();

   System.out.printf("Volume %d%n",drive.getVolume());
   System.out.printf("Mp3 is now on: %s%n",drive.getIsOn());
   System.out.printf("Mp3 %s ",drive.getPlaySound());







}







}