package StreamsAndLambda;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortArrayOfStrings {


    public static void main(String[] args) {
        String[] str = {"hey","this","is","srihari","Hi","yo","hola"};
        Stream<String> ss= Stream.of(str);
        Stream<String> ss2= Stream.of(str);
        ss.sorted((a,b) -> a.length()-b.length())
                .forEach(System.out::println);

        System.out.println("-------------------------");

        ss2.sorted((a,b) -> a.length()-b.length())
                .sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o2.charAt(o2.length()-1)-o1.charAt(o1.length()-1);

                return 0;
            }
        }).forEach(System.out::println);
    }


}
