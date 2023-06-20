package Collects;

import Test2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrintMoreThanAverage {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        l.add(new Student("Sri","hari",3.8f));
        l.add(new Student("Sri","hari", 2.6f));
        l.add(new Student("Sri","hari",1.4f));
        l.add(new Student("Sri","hari",3.1f));
        l.add(new Student("Sri","hari",2.8f));


        System.out.println(l.stream().mapToDouble(s -> s.gpa).average());



    }

}
