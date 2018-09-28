/* Programmer: Samantha Shoecraft
   Program: TicketOrder.java
   Date: 2/18/2016
   Description: stores a collection of Tickets. Shold provide methods add, toString and totalPrice.
*/

import java.util.*;

public class TicketOrder {
      //variables
    protected int[][] tickets = new int[100][2];
    protected int answer;
    protected int  days;  
    protected int total;
    protected String recipt = "";
   //constructor
   public TicketOrder(){
      //implement scanner to get input
       Scanner input = new Scanner (System.in);
       //flag for input varification
       boolean flag = false;
       while (!flag){      
          System.out.println("Please enter the type of Ticket you wish to order: \n1. Complimentary Ticket\n2. Walkup Ticket\n3. AdvanceTicket\n4. Student Advance Ticket\n5. Exit");
          //check input
          while(!input.hasNextInt()){
            input.next();
            System.out.print("Please enter a valid ticket option, or enter 5 to exit and print recipt");
          }
          answer = input.nextInt();
          //check ticket type
          if (answer == 1){
            add(0,"comp");
          }else if (answer == 2){
            add(0, "walk");
          }else if (answer == 3){
            System.out.println("Please Enter number of days in advance");
            //validate number of days
            while(!input.hasNextInt() && input.nextInt() > 0){
               input.next();
               System.out.println("Please enter a valid number of days");
            }
            days = input.nextInt();
            add(days, "advance");
         }else if (answer == 4){
            System.out.println("Please Enter number of days in advance");
            while(!input.hasNextInt() && input.nextInt() < 0){
               input.next();
               System.out.println("Please enter a valid number of days");
            }
            days = input.nextInt();
            add(days, "student");
         }else if (answer == 5){
            flag = true;
         }else{
            System.out.println("Please enter a valid choice");
         }
      }
      //get total for tickets sold
      total = totalPrice(tickets);
      // print tickes and total
      System.out.println("Your order: ");
      System.out.println(toString(recipt, total));
   }
   //adds ticket and prices to ticket array
   public void add(int days, String type){
      //Checks ticket type
      if (type.equals("comp")){
          ComplimentaryTicket newTic = new ComplimentaryTicket();
          int serial = newTic.serial_number;
          int price = newTic.price;
          tickets[serial - 1][0] = serial;
          tickets[serial - 1][1] = price;
         recipt += newTic.toString() + "\n";
      }else if (type.equals("walk")) {
         WalkupTicket newTic = new WalkupTicket();
         int serial = newTic.serial_number;
         int price = newTic.price;
         tickets[serial - 1][0] = serial;
         tickets[serial - 1][1] = price;
         recipt += newTic.toString() + "\n";
      }else if (type.equals("advance")) {
         AdvanceTicket newTic = new AdvanceTicket(days);
         int serial = newTic.serial_number;
         int price = newTic.price;
         tickets[serial - 1][0] = serial;
         tickets[serial - 1][1] = price;
         recipt += newTic.toString() + "\n" ;
      }else if (type.equals("student")) {
         StudentAdvanceTicket newTic = new StudentAdvanceTicket(days);
         int serial = newTic.serial_number;
         int price = newTic.price;
         tickets[serial - 1][0] = serial;
         tickets[serial - 1][1] = price;
         recipt += newTic.toString() + "\n";
      }
    }
   //uses array to total ticket prices
   public int totalPrice(int[][] tickets) {
      for (int i = 0; i <100; i++) {
         if (!(tickets[i][1]== 0)) {
            total += tickets[i][1];
         }
      }
      return total;
   }
   //creates string for tickets, prices and total
   public String toString(String recipt, int total){
      return (recipt + "Your total is: $" + total);
   }
}      