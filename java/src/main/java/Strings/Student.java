package Strings;

public class Student implements Comparable<Student>{

    public String fn;
    String ln;
    public float gpa;


    public Student(String fn, String ln, float gpa) {
        this.fn = fn;
        this.ln = ln;
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Student o) {
        return (this.ln).compareTo(o.ln);
    }

    @Override
    public String toString() {
        return this.fn+"  " +this.ln+"  " +this.gpa;
    }
}
