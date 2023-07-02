package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "srihari";
        String s2 = "srriiah";
        System.out.println(checkAnagram(s1,s2));

    }
    static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length())return false;
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

}
