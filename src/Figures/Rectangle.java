package Figures;

public class Rectangle implements GeometricFigure{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculateArea(double a, double b) {
        return GeometricFigure.super.calculateArea(a, b);
    }

    public int getA() {
        return (int) a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
