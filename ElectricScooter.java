/**
 * A subclass ElectricScooter child class of Vehicle class is created with eight attribute range as int, battryCapacity as int,
 * price as int, chargingTime as String, brand as String, mileage as String, hasPurchased as boolean and hasSold as boolean.
 * Constructor is created for EkectricScooter class with six parameter. Superclass constructor with four parameter as vehicleID,
 * vehicleName, vehicleColor and vehicleWeight. Mutator method vehicleSpeed and vehicleColor of Vehicle class is call within the
 * constructor. Initilize engineDisplacement with parameter value. range and price is set to zero and brand, mileage and 
 * chargingTime is set to be empty string. hasPurchased and hasSold is set to be false. Accessor method for each attribute 
 * created while mutator method for brand is created in which condition is checked if ElectricScooter is already purchased a 
 * message is display that it is not possible to change brand. A purchased method is created that take brand, price, 
 * chargingtime, mileage and range as parameter. Mutator method of ElectricScooter brand is called. If ElectricScooter is not 
 * purchased  price,chargingTime, mileage and range is initilize with parameter value. hasPurchased is set to be false. Another 
 * method Sell is create with a parameter price.If hasSold is false, price value is initilize with parameter value. chargingTime
 * and mileage is set to be empty string while batteryCapacity and range is set to be zero. And hasSold is set true and 
 * hasPurchased is set to be false, a message is display indicating ElectricScooter is already sold.
 * 
 * @MOHAMMAD TAUSHIF REZA
 * 2022/05/16
 */
public class ElectricScooter extends Vehicle
{
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
 
      //creating constructor
      /*
       A constructor is created for ElectricScooter with six parameter vehicleID, vehicleName, vehicleWeight,vehicleSpeed,
       vehicleColor and batteryCapacity. Superclass constructor is called with four parameter vehicleID, vehicleName, 
       vehicleColor and vehicleWeight. mutator method vehicleSpeed and VehicleColor of parent class is called using super 
       keyword. battryCapacity is initilize with parameter value while range and parice is set as zero. brand, mileage and 
       chargingTime as empty string. hasPurchased and hasSold as false is set.
       */
      public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, 
                             String vehicleSpeed, String vehicleColor, int batteryCapacity)
                            {
                              //calling superclass constructor with super keyword
                              super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
                              
                              //calling superclass setter method using super keyword
                              super.setvehicleSpeed(vehicleSpeed);
                              super.setvehicleColor(vehicleColor);
                              
                              this.batteryCapacity=batteryCapacity;
                              this.range=0;
                              this.price=0;
                              this.brand="";
                              this.mileage="";
                              this.chargingTime="";
                              this.hasPurchased=false;
                              this.hasSold=false;
                            }
                          
      //creating accessor method or getter for each attribute
      public int getrange()
      {
           return this.range;
      }
   
      public int getbatteryCapacity()
      {
           return this.batteryCapacity;
      }
   
      public int getprice()
      {
         return this.price;
      }
   
      public String getchargingTime()
      {
         return this.chargingTime;
      }
   
      public String getbrand()
      {
         return this.brand;
      }
   
      public String getmileage()
      {
         return this.mileage;
      }
   
      public boolean gethasPurchased()
      {
         return this.hasPurchased;
      }
   
      public boolean gethasSold()
      {
         return this.hasSold;
      }
   
      //creating setter or mutator method Brand attribute
      /*
       A mutator method for hasPurchased is created in which a condition is check if ElectricScooter is purchased then a display
       mwssage is display it not possible to change the brand.
       */
      public void setbrand(String brand)
      {
         if (hasPurchased ==true)
         {
           this.brand=brand;
           System.out.println("Sorry it not possible to change brand after purchased");
         }
      }
   
      //creating a method to purchase electric scooter
      /*
       Creating an instance method Purchased for ElectricScooter that takes brand, price, chargingTime, mileage and range as a 
       parameter.if ElectricScooter is not purchased setbrand is called with parameter value and price, chargingTime, mileage
       and range is initilize with parameter value. And hasPurchased is set to true.
       */
      public void Purchase(String brand, int price, String chargingTime, String mileage, int range)
      {
         if(hasPurchased ==false)
         {
           this.setbrand(brand);
           this.price=price;
           this.chargingTime=chargingTime;
           this.mileage=mileage;
           this.range=range;
           this.hasPurchased=true;
         }
      }
   
      //creating a method to sell electric scooter
      /*
       Create a instance method Sell for ElectricScooter class that take price as parameter. if ElectricScppter is not sold then
       status of hasSold is false then initilize price with parameter value. chargingTime and mileage is set as empty string,
       batteryCapacity and range set as zero, then the status of hasSold is set true and hasPurchased as false. And a message is
       display as ElectricScooter is sold.
       */
      public void Sell(int price)
      {
         if (hasSold == false)
         {
           this.price=price;
           this.chargingTime="";
           this.mileage="";
           this.batteryCapacity=0;
           this.range=0;
           this.hasSold=true;
           this.hasPurchased=false;
           System.out.println("The ElectricScooter is sold");
         }
         else
         {
             System.out.println("The ElectricScooter is " + hasSold );
         }
      }
   
      //display method
      /*
       a display method is created calling display method of Vehicle class vehivleID, vehicleName, vehicleWeight, vehicleSpeed
       and vehicleColor. it will print the value of brand, batteryCapacity, mileage, range and chargingTime.
       */
      public void display()
      {
         super.display();
         
         if ( hasPurchased ==true)
         {
         System.out.println("The brand is " + brand);
         System.out.println("The batteryCapacity is " + batteryCapacity);
         System.out.println("The mileage is " + mileage);
         System.out.println("The range is " + range);
         System.out.println("The chargingTime is " + chargingTime);
         }
      }
    
    
}