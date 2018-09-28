/* Programmer: Samantha Shoecraft
   Program: FixedPriceTicket.java
   Date: 2/18/2016
   Discription: An abstract class represteing tickest that are always the same price.
    The constructor accepts the price as the parameter.
*/

import java.util.*;

public abstract class FixedPriceTicket extends Ticket {
   protected int price;
   //abstract constructor that accepts price as a parameter
   public abstract int FixedPriceTicket(int price);
   
   //Gets price information
   public int getPrice() {
      return price;
   }
   //creates toString for fixed price
   public String toString(){
      return super.toString(serial_number, price);
   }
      
}
   