package Collects;

import java.util.HashMap;
import java.util.stream.Stream;

public class StringRep {
    public static void main(String[] args) {
        String s= "teststring";
        String temp="";

        HashMap<Character,Integer> hm= new HashMap<>(s.length());
        int count;
        for(int i=0;i<s.length();i++) {
            count=0;
            if(!hm.containsKey(s.charAt(i))) {
                for (int j = i + 1; j < s.length(); j++)
                    if (s.charAt(i) == s.charAt(j))
                        count++;
                hm.put(s.charAt(i), count + 1);
            }

        }
        hm.forEach((k,v) -> System.out.println(k+" "+v));


    }
}
