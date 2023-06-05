package Task3;

public class Shape {

    static int area;

    static int getArea() {

        return Shape.area;
    }

    static void setArea(int a){
        Shape.area = a;
    }

    static {
        setArea(24);
    };

    public static void main(String[] args) {
        System.out.println(getArea());
    }
}

