package Collects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Hi");
        l.add("this");
        l.add("is");
        l.add("Srihari");

        l.remove(l.size()-1);

        Stream.of(l).forEach(System.out::println);
    }
}
