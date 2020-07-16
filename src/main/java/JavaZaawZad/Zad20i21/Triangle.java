package JavaZaawZad.Zad20i21;

public class Triangle extends  Shape{

    private double a;
    private double b;
    private double c;
    private double h;

    @Override
    public double calculateParm() {
        return a + b +c;
    }

    @Override
    public double calculateArea() {
        return (a * h) / 2.0;
    }
}


