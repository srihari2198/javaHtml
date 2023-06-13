package ExceptionHandling;

public class CustomException extends RuntimeException{

    @Override
    public String toString() {
        return "CustomException : Divide by zero is not possible" ;
    }
}
