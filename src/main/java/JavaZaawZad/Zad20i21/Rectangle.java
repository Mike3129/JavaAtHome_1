package JavaZaawZad.Zad20i21;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;

    @Override
    public double calculateParm() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
