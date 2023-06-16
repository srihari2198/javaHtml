package ThreasSync;

public class TicketSystem extends Thread{

    TicketProvider ts;
    TicketSystem(TicketProvider t){
        this.ts=t;
    }


    @Override
    public void run() {

            this.ts.giveTicketes(10);

    }

    public static void main(String[] args) throws InterruptedException {

        TicketProvider tp = new TicketProvider();


        for(int i=0;i<5;i++){
            TicketSystem t = new TicketSystem(tp);
            t.start();

        }

    }
}
