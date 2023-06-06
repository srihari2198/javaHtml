package Test1;

public class Fibonacci {

    public static void main(String[] args) {
        printFibonacci(10);
    }

    static void printFibonacci(int n){
        int first=0;
        int next =1;
        int temp=0;
        if(n==1)System.out.print(first);

        if(n>=2)System.out.print(first+" "+next);

        for(int i=2;i<n;i++){
            temp = first;
            first = next;
            next = temp + next;
            System.out.print(" "+next);

        }
    }

}
