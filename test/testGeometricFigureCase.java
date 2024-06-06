import Figures.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testGeometricFigureCase {


    @Test
    public void calculateRectField(){
        Rectangle testObjectRectangle = new Rectangle(4,6); //4*6 = 24
        Assertions.assertEquals(24,testObjectRectangle.calculateArea(testObjectRectangle.getA(), testObjectRectangle.getB()));
    }

    @Test
    public void calculateTriangleField(){
        Triangle testObjectTriangle = new Triangle(4,6); //(4/2)*6 = 12
        Assertions.assertEquals(12,testObjectTriangle.calculateArea(testObjectTriangle.getA(), testObjectTriangle.getH()));
    }

    @Test
    public void calculateHexField(){
        Hexagon testObjectHex = new Hexagon(6); //   (3* sqrt3)/2   * (6*6) = 93.53
        Assertions.assertEquals(93.53,testObjectHex.calculateArea(testObjectHex.getA(),1));
    }

    @Test
    public void calculateSquareDiameter(){
        Square square = new Square(8,0);
        Assertions.assertEquals(64,square.calculateDiameter(square.getA()));
    }

    ///////fails
    @Test
    public void calculateRectFieldFail(){
        Rectangle testObjectRectangle = new Rectangle(4,2); //4*2 = 8
        Assertions.assertNotEquals(24,testObjectRectangle.calculateArea(testObjectRectangle.getA(), testObjectRectangle.getB()));
    }

    @Test
    public void calculateTriangleFieldFail(){
        Triangle testObjectTriangle = new Triangle(6,6); //(6/2)*6 = 18
        Assertions.assertNotEquals(12,testObjectTriangle.calculateArea(testObjectTriangle.getA(), testObjectTriangle.getH()));
    }

    @Test
    public void calculateHexFieldFail(){
        Hexagon testObjectHex = new Hexagon(5); // = 65
        Assertions.assertNotEquals(65,testObjectHex.calculateArea(testObjectHex.getA(),1));
    }

    @Test
    public void calculateSquareDiameterFail(){
        Square square = new Square(9,0);
        Assertions.assertNotEquals(64,square.calculateDiameter(square.getA()));
    }


}
