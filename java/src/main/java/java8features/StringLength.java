package java8features;

import java.util.Optional;

public class StringLength {
    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            return Optional.of(input.length());
        }
    }

    public static void main(String[] args) {
        System.out.println(getStringLength("this si srihari"));
        System.out.println(getStringLength(null).isPresent());
        System.out.println(getStringLength(null));
    }
}