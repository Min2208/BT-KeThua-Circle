public class Main {
    public static void main(String[] args) {
        Circle a=new Circle();
        System.out.println(a.toString());
        a.setColor("red");
        a.setRadius(5);
        System.out.println(a.toString());

        Cylinder b=new Cylinder();
        System.out.println(b.toString());
        b.setColor("yellow");
        b.setRadius(10);
        b.setHeight(20);

        System.out.println(b.toString());
        System.out.println(b.getVolume());
    }
}
