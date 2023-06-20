package Collects;

import java.util.ArrayList;
import java.util.List;

public class ArrListToArray {

    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Hi");
        l.add("this");
        l.add("is");
        l.add("Srihari");

        String[] arr = new String[l.size()];
        int i=0;
        for(String s:l) {
            arr[i] = l.get(i);
            i++;
        }

       Object[] arr1= l.stream().toArray();

        for(String s:arr)
            System.out.print(s);
        System.out.println();

        for(Object s:arr1)
            System.out.print(s);
    }
}
