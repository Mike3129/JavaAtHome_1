package JavaZaawZad.Zad20i21;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2.0,6.0);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateParm());

        Shape3D qube = new Qube(3);
        System.out.println(qube.calculateVolume());
        System.out.println(qube.calculateParm());


    }
}
