package intrfacesStaticFinal.Task2;

public class Square extends Shape{
    public int area;

    public Square(int area,int edges) {
        this.edges = edges;
        this.area = area;
    }

    public Square(int area) {
        this.area = area;
    }

    public static void main(String[] args) {
        Square s = new Square(24,1);
        Square s2 = new Square(36);

        System.out.println(+s2.area);
        System.out.println(""+s.area+"  "+s.edges);
    }
}
