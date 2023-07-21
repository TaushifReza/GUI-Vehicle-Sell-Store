/**
 * A subclass AutoRickshaw child class of Vehicle class is created with eight attribute endineDisplacement as int,
 * torque as String, numberOfSats as int, fuelTankCapacity as int, groundClearance as String, chargeAmount as int, bookedDate
 * as String and isBoked as boolean. Constructor is created with nine parameter in which a call is made for parent class
 * constructor with four parameter vehicleID, vehicleName, vehicleColor and vehicleWeight. Mutator method vehicle of parents 
 * class vehicleSpeed and vehicleColor is called within theconstructor. The parameter value of constructor is initilize and 
 * isBooked status is set to false. Accessor method is created for each attribute of AutoRickshaw class. Mutator method is made 
 * for chargeAmount and numberOfSeats only. A instance method Book is create with three parameter bookedDate, chargeAmount and
 * numberOfSeats. Mutator method for chargeAmount and numberOfSeats is called is called isBooked is set true. A message is 
 * display with vehicleID with suitable annotation when AutoRickshaw is already booked.
 * 
 * @MOHAMMAD TAUSHIF REZA
 * 2022/05/16
 */
public class AutoRickshaw extends Vehicle
{
    
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    
      //creating a constructor
      /*
       A constructor for AutoRickshaw that takes nine parameter vehicleID, vehicleName, vehicleWeight, vehicleColor,
       vehicleSpeed, engineDisplacement, torque, fuelTankCapacity and groundClearance is created. A call is made to super class constructor
       with four parameter vehicleID, vehicleName, vehicleColor and vehicleWeight. A call is made to mutator method of Vehicle 
       Class vehicleSpeed and vehicleColor. Also parameter value is initilize in the constructor and idBooked is set to false. 
       */
      public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, 
                          int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance)
                          {
                           //calling superclass constructor using super keyword   
                           super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
                           
                           //calling superclass setter method using super keyword
                           super.setvehicleSpeed(vehicleSpeed);
                           super.setvehicleColor(vehicleColor);
                           
                           //initilize the parameter value and isBooked ststus is set to false 
                           this.engineDisplacement=engineDisplacement;
                           this.torque=torque;
                           this.fuelTankCapacity=fuelTankCapacity;
                           this.groundClearance=groundClearance;
                           this.isBooked=false;
                          }
                          
      //creating accessor method or getter for each attribute
      public int getengineDisplacement()
      {
          return this.engineDisplacement;
      }
      
      public String gettorque()
      {
          return this.torque;
      }
      
      public int getnumberOfSeats()
      {
          return this.numberOfSeats;
      }
      
      public int getfuelTankCapacity()
      {
          return this.fuelTankCapacity;
      }
      
      public String getgroundClearance()
      {
          return this.groundClearance;
      }
      
      public int getchargeAmount()
      {
          return this.chargeAmount;
      }
      
      public String getbookedDate()
      {
          return this.bookedDate;
      }
      
      public boolean getisBooked()
      {
          return this.isBooked;
      }
      
      //creating mutator method or setter for ChargeAmount and NumberOfSeats
      public void setchargeAmount(int chargeAmount)
      {
          this.chargeAmount=chargeAmount;
      }
      
      public void setnumberOfSeats(int numberOfSeats)
      {
          this.numberOfSeats=numberOfSeats;
      }
      
      //Book method for AutoRickshaw
      /*
       creating a instance method book for auto-rickshaw that take bookedDate, chargeAmount and numberOfSeats as parameter and 
       also mutator method numberOfSeats and chargeAmount is called. It check weather the autorickshaw isBooked then initialize
       the value including vehicleID with suitable annotation.
      */
      public void Book(String bookedDate, int chargeAmount, int numberOfSeats)
      {
          if(isBooked ==false)
          {
          this.bookedDate=bookedDate;    
          //calling mutator method chargeAmount and numberOfSeats    
          this.chargeAmount=chargeAmount;
          this.numberOfSeats=numberOfSeats;
          this.isBooked=true;
          //printing the isBooked with VehicleID
          System.out.println("The AutoRickshaw with vehicleID " + getvehicleID() + " is Booked");
          }
          else
          {
              System.out.println("The AutorickShaw is already booked");
          }
      }
      
      //display method
      /*
        creating a display method for AutoRickshaw with same dispaly method as Vehicle class calling vehicleID, vehicleName,
        vehicleWeight, vehicleColor and vehicleSpeed. Print enginDisplacement, torque, fuelTankCapacity, groundClerance and
        bookedDate.A empty message is display for chargeAmount and numberOfSeats if their values are zero.
       */
      public void display()
      {
          //calling display method of Vehicle class
          super.display();
          
          System.out.println("The engineDisplacement is " + engineDisplacement);
          System.out.println("The torque is " + torque);
          System.out.println("The fuelTankCapacity is " + fuelTankCapacity);
          System.out.println("The groundClearance is " + groundClearance);
          System.out.println("The bookedDate is " + bookedDate);
          
          //if chargeamount is not set empty message should be display
          if (chargeAmount ==0)
          {
              System.out.println("The chargeAmount is zero");
          }
          else
          {
              System.out.println("The chargeAmount is " + chargeAmount);
          }
          
          //if number of seats is not set empty message should be display
          if (numberOfSeats ==0)
          {
              System.out.println("The numberOfSeats is zero" );
          }
          else
          {
              System.out.println("The numberOfSeats is " + numberOfSeats);
          }
      }
      
    
}