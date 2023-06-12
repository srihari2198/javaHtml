package Test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/Users/srihari/Downloads/student.csv");
        Scanner s = new Scanner(f);
        String line;

        Student[] stu = new Student[10];
        for(int i=0;s.hasNextLine();i++){
            line= s.nextLine();
            String[] arrS = line.split(",");
            String firstName = arrS[0];
            String lastName = arrS[1];
            float gpa = Float.parseFloat(arrS[2]);
            stu[i]= new Student(firstName, lastName, gpa);

        }


       Arrays.sort(stu ,
               new SortByName() );

        for (Student s2:
             stu) {
            System.out.println(s2);
        }

    }
}
