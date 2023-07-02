package Threads;

public class TicketSystem {

    public static void main(String[] args) throws InterruptedException {

        TicketProvider tp = new TicketProvider();


        for(int i=0;i<5;i++){
            Thread t = new Thread(new Runnable(){

                @Override
                public void run() {
                    tp.giveTicketes(10);
                }
            });
            t.start();

        }

    }
}
