package StreamsAndLambda;

import java.util.stream.Stream;

public class StrVowels {
    public static void main(String[] args) {
        String[] arr = {"hi","this","is","srihari","aeiou","sky"};
        Stream<String> s1 = Stream.of(arr);
        s1.filter(StrVowels::containVowels).
                map( StrVowels::numOfVowelsAndString).
                forEach(System.out::println);
    }
    public static boolean containVowels(String s){
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                 return true;
             }
         }
        return false;
    }
    public static String numOfVowelsAndString(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;

            }
        }
        return count +" " +s ;
    }
}
