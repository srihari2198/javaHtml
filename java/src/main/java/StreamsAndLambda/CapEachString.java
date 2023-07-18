package StreamsAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CapEachString {
    public static void main(String[] args) {
        String[] str = {"hi", "this", "is", "srihari"};

        List<String> ls = new ArrayList<>(Arrays.asList("hi", "this", "is", "srihari"));

        Stream<String> ss = Stream.of(str);
        ss.map(s1 -> s1.substring(0, 1).toUpperCase() + s1.substring(1))
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------------------");

        Stream.of(ls).filter(a ->
                {
                    if (a.size() == 8)
                        return true;
                    return false;
                }
        ).forEach(System.out::println);

        System.out.println("--------------------------------------");

        ls.stream().filter(a ->
                {
                    if (a.charAt(0) == 'h')
                        return false;
                    return true;
                }

        ).forEach(System.out::println);


    }


}
