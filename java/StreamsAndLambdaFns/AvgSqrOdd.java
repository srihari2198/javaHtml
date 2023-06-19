package StreamsAndLambda;

import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class AvgSqrOdd {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> si = Stream.of(arr);

        System.out.println(si.filter(i -> i%2!=0)
                .mapToDouble(i -> i*i).average());

    }
}
