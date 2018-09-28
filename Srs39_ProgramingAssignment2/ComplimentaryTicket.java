/* Programmer: Samantha Shoecraft
   Program: ComplimentaryTicket.java
   Date: 2/18/2016
   Discription: Creates free ticket;
*/

import java.util.*;

public class ComplimentaryTicket extends FixedPriceTicket{
   //constructs new free ticket
   public ComplimentaryTicket(){
    this.price = 0;
    super.serialNumbers[serial_number-1] = serial_number;
   }
   // returns price of comp ticket
   public int FixedPriceTicket(int price) {
      return this.price;
   }

   
}