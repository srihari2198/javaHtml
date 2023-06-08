package Test2;

import java.util.Arrays;

public class StringRot {

    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";    //"JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"
        String s2 = "StrutsHibernateJavaJ2ee";
        System.out.println(checkRot(s1,s2));

    }
    static boolean checkRot(String s1,String s2){
        if(s1.length() != s2.length())return false;
        String temp=s1;
        for(int i=0;i<s1.length();i++){
           temp = s1.substring(i+1,s1.length()) + s1.substring(0,i+1);
           if(temp.equals(s2))return true;
           temp=s1;
        }
        return false;
    }
}
