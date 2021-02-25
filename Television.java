    public class Television{

   private String productName;
   private boolean isOn; 
   private int channel;
   private int volume;
 
   public void setProductName(String productName){
     this.productName = productName;
 }   
   
   public void setIsOn(boolean isOn){
     this.isOn = isOn;
 }
    
   public void setChannel(int channel){
     this.channel = channel;
    
 }   

   public void setVolume(int volume){
     this.volume = volume;
 }   
     public String getProductName(){
      return productName;

}

   public boolean getIsOn(){
      return isOn;

}
     public int getChannel(){
      return channel;

}     
      public int getVolume(){
       return volume;

}





}