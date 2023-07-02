package collections.map;

import Strings.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PrintHashMap {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>(8);
        File f = new File("/Users/srihari/Downloads/student.csv");
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;

        for(int i=0;i<8;i++){
            line= s.nextLine();
            String[] arrS = line.split(",");
            String firstName = arrS[0];
            String lastName = arrS[1];
            float gpa = Float.parseFloat(arrS[2]);
            hm.put(firstName,new Student(firstName, lastName, gpa));

        }

        Set<Map.Entry<String,Student>> s1 = hm.entrySet() ;

       for(Map.Entry<String,Student> he : hm.entrySet())
           System.out.println(he.getKey()+"  "+he.getValue());

        System.out.println("----------------------------------------------------");

       hm.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("----------------------------------------------------");

        Iterator<String> it = hm.keySet().iterator();
        String key = "";
        while(it.hasNext()) {
            key = it.next();
            System.out.println(key + " " + hm.get(key));
        }


    }
}
