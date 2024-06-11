package Figures;

public class Square extends Rectangle{

    public Square(double a) {
      super(a,a);
    }

    public int calculateDiameter(){
      return (int) (a*a);
    }
}
