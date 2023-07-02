package Strings;

import java.util.Arrays;

public class RevEWord {
    public static void main(String[] args) {
        String s1="this is srihari";
        printRev(s1);

    }

    static void printRev(String s1){
        String[] c1 = s1.split(" ");
        String temp = "";
        String revString = "";
        for(int i=0;i<c1.length;i++){
            for(int j=c1[i].length()-1;j>=0;j--){
                temp+=c1[i].charAt(j);
            }
            revString+=temp+" ";
            temp="";
        }
        System.out.println(revString);
    }
}
