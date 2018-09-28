/* Programmer: Samantha Shoecraft
   Program: AdvanceTicket.java
   Date: 2/18/20/16
   Description: Creates advanced perchased ticket and retruns price based on the number of days befor event it was purchased
*/

import java.util.*;

public class AdvanceTicket extends Ticket {
   protected int days;
   
   // Constructs new ticket based on number of days in advance it was purchased
   
   public AdvanceTicket (int days) {
      super();
      serialNumbers[serial_number-1] = serial_number;
      if (days >= 10){
         this.price = 30;
      }else if (days < 10 && days >0){
         this.price = 40;
      }else {
         this.price = 50;
      }
      }
   //gets ticket price
   public int getPrice() {
      this.price = price;
      return this.price;
   }
    //makes string representation of ticket and price
   public String toString() {
      return super.toString(serial_number, price);
   }
}