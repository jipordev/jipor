public class Fan {
   private String brand;
   private String type;
   private String color;
   private int size;
   private int speed;
   private boolean isOn;
   private boolean isSwing;
   public Fan(){
       speed = 0;
       isOn = false;
       isSwing = false;
   }
   public Fan(String brand, String type, String color, int size){
       this.brand = brand;
       this.type = type;
       this.color = color;
       this.size = size;
       this.isOn = false;
       this.isSwing = false;
       this.speed = 0;
   }
   public void turnON(){
       if(this.isOn){
           this.isOn = false;
           this.speed = 0;
           this.isSwing =false;
       }
       else{
           this.isOn = true;
           this.speed = 1;
       }
   }
   public void increaseSpeed(){
       if(this.isOn && this.speed <4){
           speed++;
       }
       else{
           this.speed = 1;
       }
   }
   public void Swing(){
       this.isSwing = !this.isSwing;
   }
   //getter methods
   public boolean isOn(){
       return isOn;
   }
   public String getBrand(){
       return brand;
   }
   public String getType(){
       return type;
   }
   public String color(){
       return color;
   }
   public int getSpeed(){
       return speed;
   }
   public boolean isSwing(){
       return isSwing;
   }
   //setter method
   public void setBrand(String brand){
       this.brand = brand;
   }
   public void setType(String type){
       this.type = type;
   }
   public void setColor(String color){
       this.color = color;
   }
   public void setSize(int size){
       this.size = size;
   }
   public void setIsOn(boolean isOn){
       this.isOn = isOn;
   }
   public void setIsSwing(boolean isSwing){
       this.isSwing = isSwing;
   }
   @Override
   public String toString(){
       return this.brand +", "+ this.type+", "+ this.color+", "+this.size +" :"+this.isOn +" "+this.speed+" "+this.isSwing;
   }
   public static void main(String[] args){
       Fan fan1 = new Fan();
       fan1.setBrand("hatari");
       fan1.setType("Stand Fan");
       fan1.setColor("Pink");
       fan1.setSize(15);
       fan1.turnON();
       System.out.println(fan1.toString());
   }
}
   
