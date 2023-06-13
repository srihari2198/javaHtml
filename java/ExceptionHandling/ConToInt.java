package ExceptionHandling;

public class ConToInt {

    public static void main(String[] args) {
        String s = "123f";
        try {
            System.out.println(converToInt(s));

        }
        catch (NumberFormatException e) {
            System.out.println(e+"   Cannot convert  String to integer");
        }

    }

    static int converToInt(String s) throws ArithmeticException{
        return Integer.parseInt(s);
    }
}
