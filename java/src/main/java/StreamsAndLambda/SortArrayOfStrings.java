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
                .sorted((a,b) -> {
                    if(a.length()==b.length())
                        return b.charAt(b.length()-1)-a.charAt(a.length()-1);
                    return 0;
        }).forEach(System.out::println);

        System.out.println("-------------------------");



    }


}
