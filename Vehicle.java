/**
 * A parents class Vecile is created with five attribute vehivleID, vehicleNameVehicleWeight, vehicleWeight, vehicleColor and 
 * vehicleSpeed. The vehicleID represent int while rest as String data type. a constructor is created with five parameter and 
 * initilize the parameter value into the constructor. Acessor method is made for each atrribue while mutator method is made for
 * only vehicleSpeed and vehicleColor. A display method is made with suitable annotated output for each attribute and if 
 * vehicleWeight is empty the empty message is display.
 * 
 * @MOHAMMAD TAUSHIF REZA
 * 2022/05/16
 */
public class Vehicle
{
   private int vehicleID;
   private String vehicleName;
   private String vehicleWeight;
   private String vehicleColor;
   private String vehicleSpeed;
    
      //creating constructor
      /*
       A constructor for Vehicle Class is created with four parameter vehicleID, VehicleName, vehicleColor and vehicleWeight.
       The parameter value is initilize within the constructor. 
       */
      public Vehicle(int vehicleID, String vehicleName, String vehicleColor, String vehicleWeight)
        {
            this.vehicleID=vehicleID;
            this.vehicleName=vehicleName;
            this.vehicleColor=vehicleColor;
            this.vehicleWeight=vehicleWeight;
        }
        
      //creating accessor method or getter for each attribute
      public int getvehicleID()
      {
          return this.vehicleID;
      }
      
      public String getvehicleName()
      {
          return this.vehicleName;
      }
      
      public String getvehicleWeight()
      {
          return this.vehicleWeight;
      }
      
      public String getvehicleColor()
      {
          return this.vehicleColor;
      }
      
      public String getvehicleSpeed()
      {
          return this.vehicleSpeed;
      }
      
      //creating setter method for vehicleSpeed and vehicleColor
      public void setvehicleSpeed(String vehicleSpeed)
      {
          this.vehicleSpeed=vehicleSpeed;
      }
      
      public void setvehicleColor(String vehicleColor)
      {
          this.vehicleColor=vehicleColor;
      }
      
      //creating display method for Vehicle
      /*
       A display method for Vehicle class is created to display vehicleID, vehicleName, vehicleColor and vehicleSpeed. If 
       vehicleWeight is empty a empty message is display with suitable annotation.   
       */
      public void display()
      {
          System.out.println("The vehicleID is " + vehicleID);
          System.out.println("The vehicleName is " + vehicleName);
          System.out.println("The vehicleColor is " + vehicleColor);
          System.out.println("The vehicleSpeed is " + vehicleSpeed);
          
          //if vehicleWeight is empty then empty message will display
          if (vehicleWeight =="")
          {
              System.out.println("The vehicleWeight is empty" );
          }
          else
          {
              System.out.println("The vehivleWeight is " + vehicleWeight);
          }
      }
}