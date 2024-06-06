package Figures;

import java.text.DecimalFormat;

public interface GeometricFigure {



    public default double calculateArea(double a, double b){
        if (b < 1){
            b = 1;
        }
        double result = a * b;
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }

}
