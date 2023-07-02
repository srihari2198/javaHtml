package ExceptionHandling;

public class CMain {

    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        } catch (ArithmeticException e) {
            throw new CustomException();
        }
    }
}
