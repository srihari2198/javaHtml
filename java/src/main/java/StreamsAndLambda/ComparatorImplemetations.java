package StreamsAndLambda;

import Strings.Student;

import java.util.Comparator;

public class ComparatorImplemetations implements Comparator<Student> {




    FunctionalInterfaceTesting f = (a) -> a.fn;
    public int compare(Student o1, Student o2) {
        return f.getName(o1).compareTo(f.getName(o2));
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
