package Threads;

public class FirstThread extends Thread{

    public void run(){
        for(int i=1;i<11;i++){
            System.out.print(" " +i);
        }
    }

    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
         ft.start();
    }
}
