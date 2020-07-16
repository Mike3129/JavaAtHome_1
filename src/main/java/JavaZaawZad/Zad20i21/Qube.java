package JavaZaawZad.Zad20i21;

public class Qube extends Shape3D {

    private double a;

    public Qube(double a) {
        this.a = a;
    }

    @Override
    public double calculateVolume() {
        return a*a*a;
    }



    @Override
    public double calculateArea() {
        return 0;
    }
}
