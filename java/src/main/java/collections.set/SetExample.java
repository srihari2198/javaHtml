package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(10);
        for(int i=0;i<10;i++){
            hs.add("String"+i);

        }

        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        hs.stream().forEach(System.out::print);

        System.out.println();

        for(String s:hs){
            System.out.print(s+" ");
        }
    }
}
