package Threads;

public class SecondThread implements Runnable{

    public void run(){
        for(int i=1;i<11;i++){
            System.out.print(" " +i);
        }
    }

    public static void main(String[] args) {
        SecondThread ft = new SecondThread();
        Thread t = new Thread(ft);
        t.start();
    }
}