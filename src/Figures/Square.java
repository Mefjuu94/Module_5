package Figures;

public class Square extends Rectangle{



    public Square(double a, double b) {
        super(a, b);
    }

    public int calculateDiameter(int a){
        return (int) calculateArea(a,a);
    }
}
