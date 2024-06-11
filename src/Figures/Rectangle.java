package Figures;

public class Rectangle implements GeometricFigure{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculateArea() {
        return a*b;
    }

}
