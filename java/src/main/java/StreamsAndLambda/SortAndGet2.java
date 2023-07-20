package StreamsAndLambda;

import Strings.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
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
                new Employee(1,"Srihari", LocalDate.of(1998,06,04),"male","IT"),
                new Employee(2,"uday", LocalDate.of(1998,01,04),"male","IT"),
                new Employee(3,"narain", LocalDate.of(1973,03,04),"male","IT"),
                new Employee(1,"Srihari", LocalDate.of(2021,06,04),"female","IT"),
                new Employee(2,"uday", LocalDate.of(1998,01,04),"male","IT"),
                new Employee(3,"narain", LocalDate.of(2001,03,04),"female","IT"),
                new Employee(1,"Srihari", LocalDate.of(1941,06,04),"male","IT"),
                new Employee(2,"uday", LocalDate.of(1998,01,04),"male","IT"),
                new Employee(3,"narain", LocalDate.of(1973,03,04),"female","IT"),
                new Employee(4,"ash", LocalDate.of(2023,06,04),"female","CSE"),
                new Employee(1, "John", LocalDate.of(1985, 5, 15), "Male", "IT"),
        new Employee(2, "Alice", LocalDate.of(1990, 8, 10), "female", "IT"),
        new Employee(3, "Bob", LocalDate.of(1980, 11, 25), "male", "Finance"),
        new Employee(4, "Emma", LocalDate.of(1982, 3, 20), "female", "IT"),
        new Employee(5, "Mike", LocalDate.of(1978, 9, 5), "male", "IT"));

        System.out.println("---------------------------------------------");
        HashMap<String,Integer> hm = new HashMap<String, Integer>();

        lemp.stream().filter(a ->  a.getDob().isAfter(LocalDate.now().minusYears(45))
                                   && a.getDepartment().equals("IT") ).map(a -> a.getGender().toLowerCase()).forEach(a -> {
                    int count=0;
                    if(!hm.containsKey(a))
                        hm.put(a,1);
                    else
                      count =   hm.get(a);
                    hm.replace(a,count+1);
                });
        System.out.println(hm);


        lemp.stream().filter(a ->  a.getDob().isAfter(LocalDate.now().minusYears(45))
                && a.getDepartment().equals("IT") ).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(hm);
   }
}
