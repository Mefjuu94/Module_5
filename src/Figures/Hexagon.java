package Figures;

public class Hexagon implements GeometricFigure{

    double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea(double a, double b) {
        return GeometricFigure.super.calculateArea(3 * Math.sqrt(3)/2 * Math.pow(a,2), 1);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
