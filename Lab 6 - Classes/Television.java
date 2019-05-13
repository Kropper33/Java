// The purpose of this class is to model a television
// Ryan Kropp 4/17/19
public class Television
{
   private String manufacturer;  //Holds the brand name of Television.
   private int screenSize;       //Holds the size of the television screen.
   private boolean powerOn;      //Holds the value true if on and false if off.
   private int channel;          //Holds the value of the television station.
   private int volume;           //Holds the value representing the loudness.
   
   public Television(String brand, int size)
   {
      manufacturer = brand;
      screenSize = size;
      powerOn = false;
      volume = 20;
      channel = 2;
   }
   
   public int getVolume()
   {
      return volume;
   }
   
   public int getChannel()
   {
      return channel;
   }
   
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   public int getScreenSize()
   {
      return screenSize;
   }
   
   public void setChannel(int station)
   {
      channel = station;
   }
   
   public void power()
   {
      powerOn = !powerOn;
   }
   
   public void increaseVolume()
   {
      volume++;
   }
   
   public void decreaseVolume()
   {
      volume--;
   }
}
   
