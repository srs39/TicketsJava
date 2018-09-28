/* Programmer: Samantha Shoecraft
   Program: Ticket.java
   Date: 2/18/2016
   Description: An abstract class representing all tickets.
*/

import java.util.*;

public abstract class Ticket {
   protected int serial_number;
   protected int price;
   protected int[] serialNumbers = new int[100];
   // Constructs a new ticket and saves the serial number.
   public Ticket(){
      Random r = new Random();
      // Gets random serial number between 1 and 100
      serial_number = r.nextInt(100) + 1;
      
      boolean flag = false;
      // Checks to see if tickets are taken and looks for new number if taken
      while (!flag){
         if (serialNumbers[serial_number - 1] == 0)  {
            flag = true;
         }else{
            serial_number = r.nextInt(100) + 1;
         }
      }
      // Adds serial number into array to show is taken
      serialNumbers[serial_number-1] = serial_number;
   }
   // abstract to set price
   public abstract int getPrice();
   
   // toString to print serial number and get price
   public String toString(int serial_number, int price){
      String s = "SN: " + serial_number + ", $" + price;
      return s;
   }
}
         
         