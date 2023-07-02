package StreamsAndLambda;

import java.util.stream.Stream;

public class CapEachString {
    public static void main(String[] args) {
        String[] str = {"hi","this","is","srihari"};
        Stream<String> ss= Stream.of(str);
        ss.map(s1 -> s1.substring(0,1).toUpperCase() + s1.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}
