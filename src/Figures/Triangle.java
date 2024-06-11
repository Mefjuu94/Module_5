package Figures;

public class Triangle implements GeometricFigure{
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }


    public double calculateArea() {
        return a/2*h;
    }

}
