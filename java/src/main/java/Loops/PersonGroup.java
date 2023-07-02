package Loops;

public class PersonGroup {
    public static void main(String[] args) {
        printPersonGroup(14);
        printPersonGroup(11);
        printPersonGroup(65);
    }

    static void printPersonGroup(int age){
        if(age>=0 && age<13 ) System.out.println("Kid");
        else if(age>=13 && age<=19) System.out.println("teen");
        else if(age>19)System.out.println("Adult");
    }
}
