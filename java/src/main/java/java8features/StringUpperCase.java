package java8features;


import java.util.Optional;

public class StringUpperCase {
    public static Optional<String> convertToUppercase(Optional<String> input) {
        if (input.isPresent()) {
            String uppercaseString = input.get().toUpperCase();
            return Optional.of(uppercaseString);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(convertToUppercase(Optional.empty()));
        System.out.println(convertToUppercase(Optional.of("this is srihari")));

    }
}