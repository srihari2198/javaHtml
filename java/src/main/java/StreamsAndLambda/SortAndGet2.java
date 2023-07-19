package StreamsAndLambda;

import Strings.Employee;

import java.time.LocalDate;
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




        List<Employee> lemp = Arrays.asList(
                new Employee("Srihari", LocalDate.of(2023,06,04),"male"),
                new Employee("uday", LocalDate.of(2022,01,04),"male"),
                new Employee("narain", LocalDate.of(2023,03,04),"male"),
                new Employee("ash", LocalDate.of(2023,06,04),"female")
        );
        System.out.println("---------------------------------------------");

        lemp.stream().filter(a -> a.getGender().equals("male") && a.getDob().isAfter(LocalDate.now().minusMonths(6))).forEach(System.out::println);
   }
}
