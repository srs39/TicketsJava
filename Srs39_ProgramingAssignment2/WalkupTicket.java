/* Programmer: Samantha Shoecraft
   Program: WalkupTicket.java
   Date: 2/18/2016
   Description: Class creating fixed price ticket for walk up customers.
*/

import java.util.*;

public class WalkupTicket extends FixedPriceTicket {
   
   // constructs walkup ticket
   public WalkupTicket(){
     super.serialNumbers[serial_number-1] = serial_number;
     this.price = 50;
  
   }
   //returns price of walkup ticket
   public int FixedPriceTicket(int price) {
      return this.price;
   }
}