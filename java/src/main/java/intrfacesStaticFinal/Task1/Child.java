package intrfacesStaticFinal.Task1;

public class Child implements Father, Mother {
    @Override
    public void speak(){
        System.out.println("Speaking");
    }

    public static void main(String[] args) {
        Father f = new Child();
        f.speak();
        Mother m= new Child();
        f.speak();
    }
}