package StreamsAndLambda;

import Strings.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceMain {

    public static void main(String[] args) {
        Student s = new Student("srihari","meka",4.4f);
        Student st =new Student("naveen","meka",3.9f);
        Student std =new Student("rashmitha","meka",5.2f);

        List<Student> lstd = new ArrayList<>(Arrays.asList(s,st,std));




        FunctionalInterfaceTesting f = (a) -> a.fn;

        Comparator<Student> cp = (s1,s2) -> ((int)s1.gpa-(int)s2.gpa);


        Predicate<Student> p = (b) -> b.gpa>3.0f;
        ComparatorImplemetations ci = new ComparatorImplemetations();

        lstd.stream().filter(p).sorted(cp).forEach(System.out::println);
        lstd.stream().filter(p).sorted(ci::compare).forEach(System.out::println);

//        System.out.println(p.test(s));
//
//        System.out.println(f.getName(s));
    }
}
