package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LoopsThrough {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Hi");
        l.add("this");
        l.add("is");
        l.add("Srihari");

        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
        System.out.println();


        for(String s:l)
            System.out.print(s+" ");
        System.out.println();

        Iterator i = l.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");

        System.out.println();

        Stream.of(l).forEach(System.out::println);
        Stream.of(l).forEach(s -> System.out.print(s+" "));
        Stream.of(l).parallel().forEach(System.out::println);


    }

}
