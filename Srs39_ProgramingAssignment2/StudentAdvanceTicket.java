/* Programmer: Samantha Shoecraft
   Program: StudentAdvanceTicket.java
   Date 2/18/2016
   Description: Creates student advance ticket which is half the price of the Advance ticket
*/

import java.util.*;

public class StudentAdvanceTicket extends AdvanceTicket {
   // Constructs ticket
   public StudentAdvanceTicket(int days){
      super(days);
      setPrice(super.getPrice());
      super.serialNumbers[serial_number-1] = serial_number;
      
   }
   // sets ticket price
   public void setPrice(int price){
      this.price = price /2;
   }
   //toString
   public String toString(){
      return (super.toString(serial_number, price) + "\n(Student)");
   }
}
      