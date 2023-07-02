package collections.set;


import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "srihari";

        Set<Character> sc = new TreeSet<>();


        for(int i=s.length()-1;i>=0;i--)
            sc.add(s.charAt(i));
        s ="";

        for(char ct:sc)
            s+=ct;

        System.out.println(s);



    }



}
