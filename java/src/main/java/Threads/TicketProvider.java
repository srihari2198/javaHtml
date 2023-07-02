package Threads;

public class TicketProvider {
   public int tickets = 40;

     synchronized public void giveTicketes(int count)  {
      if(this.tickets>=count) {
          this.tickets -= count;


          System.out.println("gave " + count + " tickets to " + Thread.currentThread().getName());

          System.out.println("Remaining Tickets" + this.tickets);
      }
      else {
          System.out.println("HouseFull no tickests for"+Thread.currentThread().getName());
      }
    }
}
