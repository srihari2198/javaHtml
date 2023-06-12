package Test2;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ln.compareTo(o2.ln) == 0)
            return (o1.fn).compareTo(o2.fn);
        else
            return (o1.ln).compareTo(o2.ln);
    }
}
