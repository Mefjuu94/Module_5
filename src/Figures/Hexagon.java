package Figures;

import java.text.DecimalFormat;

public class Hexagon implements GeometricFigure{

    double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat("0.00");
        double resultNotRound = (3 * Math.sqrt(3)/2 * Math.pow(a,2));
        return Math.round(resultNotRound * 100.0) / 100.0;
    }

}
