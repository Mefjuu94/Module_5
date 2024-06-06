package Figures;

public class Triangle implements GeometricFigure{
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea(double a, double b) {
        return GeometricFigure.super.calculateArea(a/2, b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
