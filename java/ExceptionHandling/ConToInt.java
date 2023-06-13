package ExceptionHandling;

public class ConToInt {

    public static void main(String[] args) {
        String s = " ";
        try {
            System.out.println(converToInt(s));

        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    static int converToInt(String s){
        return Integer.parseInt(s);
    }
}
