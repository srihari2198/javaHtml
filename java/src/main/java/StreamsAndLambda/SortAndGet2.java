package StreamsAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortAndGet2 {
    public static void main(String[] args) {
        String s= "srihari";
        String r="";

        int[] arr = new int[]{2,4,6,5,2,1};
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 4, 6, 7, 4, 9, 2, 1));

//        Stream.of(arr).filter(a -> {
//            if(a[3] == 1)
//                return false;
//            return true;
//        }).forEach(System.out::println);

        System.out.println(l.stream().sorted().distinct().toArray()[1]);
        l.stream().sorted().distinct().skip(1).limit(1).forEach(System.out::println);
       l.stream().map( a -> a +10).forEach(System.out::println);

        Stream.of(l).sorted().distinct().forEach(System.out::println);
//
        System.out.println();

        Arrays.stream(arr).sorted().forEach(System.out::print);

//        Stream.of(s).filter((a) -> {
//            if(a.charAt(2)=='i')
//                return false;
//           return true;
//        }).distinct().forEach(System.out::println);



   }
}
