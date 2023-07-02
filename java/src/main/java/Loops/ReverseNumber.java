package Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        reverse(123456);
        reverse(1001);
        reverse(256);

    }
    static  void reverse(int i){
        int temp = 0;
        int result = 0;
        while(i>0){
            temp= i%10;
            result = temp + result*10;
            i=i/10;
        }
        System.out.println(result);
    }
}