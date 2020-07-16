package JavaZaawZad.Zad20i21;

public abstract class Shape3D  extends Shape {

    public  abstract double calculateVolume();

    @Override
    public double calculateParm() {
        throw  new UnsupportedOperationException("It's not possible");
    }
}
