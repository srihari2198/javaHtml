package ThreasSync;

public class DeadLock extends Thread{
    Object a1 = new Object();
    Object a2 = new Object();
    public static void main(String[] args) {
        DeadLock d = new DeadLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (d.a1){
                    try {
                        System.out.println("Using Resource 1");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (d.a2){
                        System.out.println("Using Resource 2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (d.a2){
                    try {
                        System.out.println("Using Resource 2");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (d.a1){
                        System.out.println("Using Resource 1");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
